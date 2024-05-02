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


import com.dao.WenzhenhuifuDao;
import com.entity.WenzhenhuifuEntity;
import com.service.WenzhenhuifuService;
import com.entity.vo.WenzhenhuifuVO;
import com.entity.view.WenzhenhuifuView;

@Service("wenzhenhuifuService")
public class WenzhenhuifuServiceImpl extends ServiceImpl<WenzhenhuifuDao, WenzhenhuifuEntity> implements WenzhenhuifuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenzhenhuifuEntity> page = this.selectPage(
                new Query<WenzhenhuifuEntity>(params).getPage(),
                new EntityWrapper<WenzhenhuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenzhenhuifuEntity> wrapper) {
		  Page<WenzhenhuifuView> page =new Query<WenzhenhuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenzhenhuifuVO> selectListVO(Wrapper<WenzhenhuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenzhenhuifuVO selectVO(Wrapper<WenzhenhuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenzhenhuifuView> selectListView(Wrapper<WenzhenhuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenzhenhuifuView selectView(Wrapper<WenzhenhuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
