package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuanjinzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuanjinzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuanjinzhuView;


/**
 * 医院进驻
 *
 * @author 
 * @email 
 * @date 2021-04-21 17:03:43
 */
public interface YiyuanjinzhuService extends IService<YiyuanjinzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuanjinzhuVO> selectListVO(Wrapper<YiyuanjinzhuEntity> wrapper);
   	
   	YiyuanjinzhuVO selectVO(@Param("ew") Wrapper<YiyuanjinzhuEntity> wrapper);
   	
   	List<YiyuanjinzhuView> selectListView(Wrapper<YiyuanjinzhuEntity> wrapper);
   	
   	YiyuanjinzhuView selectView(@Param("ew") Wrapper<YiyuanjinzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuanjinzhuEntity> wrapper);
   	
}

