package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WenzhenhuifuEntity;
import com.entity.view.WenzhenhuifuView;

import com.service.WenzhenhuifuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 问诊回复
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-21 17:03:43
 */
@RestController
@RequestMapping("/wenzhenhuifu")
public class WenzhenhuifuController {
    @Autowired
    private WenzhenhuifuService wenzhenhuifuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenzhenhuifuEntity wenzhenhuifu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			wenzhenhuifu.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wenzhenhuifu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WenzhenhuifuEntity> ew = new EntityWrapper<WenzhenhuifuEntity>();
		PageUtils page = wenzhenhuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhenhuifu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenzhenhuifuEntity wenzhenhuifu, 
		HttpServletRequest request){
        EntityWrapper<WenzhenhuifuEntity> ew = new EntityWrapper<WenzhenhuifuEntity>();
		PageUtils page = wenzhenhuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhenhuifu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenzhenhuifuEntity wenzhenhuifu){
       	EntityWrapper<WenzhenhuifuEntity> ew = new EntityWrapper<WenzhenhuifuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenzhenhuifu, "wenzhenhuifu")); 
        return R.ok().put("data", wenzhenhuifuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenzhenhuifuEntity wenzhenhuifu){
        EntityWrapper< WenzhenhuifuEntity> ew = new EntityWrapper< WenzhenhuifuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenzhenhuifu, "wenzhenhuifu")); 
		WenzhenhuifuView wenzhenhuifuView =  wenzhenhuifuService.selectView(ew);
		return R.ok("查询问诊回复成功").put("data", wenzhenhuifuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenzhenhuifuEntity wenzhenhuifu = wenzhenhuifuService.selectById(id);
        return R.ok().put("data", wenzhenhuifu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenzhenhuifuEntity wenzhenhuifu = wenzhenhuifuService.selectById(id);
        return R.ok().put("data", wenzhenhuifu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenzhenhuifuEntity wenzhenhuifu, HttpServletRequest request){
    	wenzhenhuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenzhenhuifu);

        wenzhenhuifuService.insert(wenzhenhuifu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WenzhenhuifuEntity wenzhenhuifu, HttpServletRequest request){
    	wenzhenhuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenzhenhuifu);

        wenzhenhuifuService.insert(wenzhenhuifu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WenzhenhuifuEntity wenzhenhuifu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenzhenhuifu);
        wenzhenhuifuService.updateById(wenzhenhuifu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenzhenhuifuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WenzhenhuifuEntity> wrapper = new EntityWrapper<WenzhenhuifuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			wrapper.eq("yishengzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = wenzhenhuifuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
