package com.entity.view;

import com.entity.WenzhenhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问诊回复
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 17:03:43
 */
@TableName("wenzhenhuifu")
public class WenzhenhuifuView  extends WenzhenhuifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhenhuifuView(){
	}
 
 	public WenzhenhuifuView(WenzhenhuifuEntity wenzhenhuifuEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhenhuifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
