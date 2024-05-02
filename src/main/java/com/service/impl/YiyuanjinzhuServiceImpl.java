package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YiyuanjinzhuDao;
import com.entity.YiyuanjinzhuEntity;
import com.service.YiyuanjinzhuService;
import com.entity.vo.YiyuanjinzhuVO;
import com.entity.view.YiyuanjinzhuView;

@Service("yiyuanjinzhuService")
public class YiyuanjinzhuServiceImpl extends ServiceImpl<YiyuanjinzhuDao, YiyuanjinzhuEntity> implements YiyuanjinzhuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuanjinzhuEntity> page = this.selectPage(
                new Query<YiyuanjinzhuEntity>(params).getPage(),
                new EntityWrapper<YiyuanjinzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuanjinzhuEntity> wrapper) {
		  Page<YiyuanjinzhuView> page =new Query<YiyuanjinzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuanjinzhuVO> selectListVO(Wrapper<YiyuanjinzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuanjinzhuVO selectVO(Wrapper<YiyuanjinzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuanjinzhuView> selectListView(Wrapper<YiyuanjinzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuanjinzhuView selectView(Wrapper<YiyuanjinzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
