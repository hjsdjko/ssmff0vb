package com.dao;

import com.entity.YiyuanjinzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuanjinzhuVO;
import com.entity.view.YiyuanjinzhuView;


/**
 * 医院进驻
 * 
 * @author 
 * @email 
 * @date 2021-04-21 17:03:43
 */
public interface YiyuanjinzhuDao extends BaseMapper<YiyuanjinzhuEntity> {
	
	List<YiyuanjinzhuVO> selectListVO(@Param("ew") Wrapper<YiyuanjinzhuEntity> wrapper);
	
	YiyuanjinzhuVO selectVO(@Param("ew") Wrapper<YiyuanjinzhuEntity> wrapper);
	
	List<YiyuanjinzhuView> selectListView(@Param("ew") Wrapper<YiyuanjinzhuEntity> wrapper);

	List<YiyuanjinzhuView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuanjinzhuEntity> wrapper);
	
	YiyuanjinzhuView selectView(@Param("ew") Wrapper<YiyuanjinzhuEntity> wrapper);
	
}
