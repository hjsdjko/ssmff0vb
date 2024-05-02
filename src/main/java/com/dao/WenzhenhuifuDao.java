package com.dao;

import com.entity.WenzhenhuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhenhuifuVO;
import com.entity.view.WenzhenhuifuView;


/**
 * 问诊回复
 * 
 * @author 
 * @email 
 * @date 2021-04-21 17:03:43
 */
public interface WenzhenhuifuDao extends BaseMapper<WenzhenhuifuEntity> {
	
	List<WenzhenhuifuVO> selectListVO(@Param("ew") Wrapper<WenzhenhuifuEntity> wrapper);
	
	WenzhenhuifuVO selectVO(@Param("ew") Wrapper<WenzhenhuifuEntity> wrapper);
	
	List<WenzhenhuifuView> selectListView(@Param("ew") Wrapper<WenzhenhuifuEntity> wrapper);

	List<WenzhenhuifuView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhenhuifuEntity> wrapper);
	
	WenzhenhuifuView selectView(@Param("ew") Wrapper<WenzhenhuifuEntity> wrapper);
	
}
