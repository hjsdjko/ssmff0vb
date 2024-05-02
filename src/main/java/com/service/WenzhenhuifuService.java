package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenzhenhuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenzhenhuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhenhuifuView;


/**
 * 问诊回复
 *
 * @author 
 * @email 
 * @date 2021-04-21 17:03:43
 */
public interface WenzhenhuifuService extends IService<WenzhenhuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenzhenhuifuVO> selectListVO(Wrapper<WenzhenhuifuEntity> wrapper);
   	
   	WenzhenhuifuVO selectVO(@Param("ew") Wrapper<WenzhenhuifuEntity> wrapper);
   	
   	List<WenzhenhuifuView> selectListView(Wrapper<WenzhenhuifuEntity> wrapper);
   	
   	WenzhenhuifuView selectView(@Param("ew") Wrapper<WenzhenhuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenzhenhuifuEntity> wrapper);
   	
}

