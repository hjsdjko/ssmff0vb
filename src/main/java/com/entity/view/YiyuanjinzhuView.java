package com.entity.view;

import com.entity.YiyuanjinzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医院进驻
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 17:03:43
 */
@TableName("yiyuanjinzhu")
public class YiyuanjinzhuView  extends YiyuanjinzhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiyuanjinzhuView(){
	}
 
 	public YiyuanjinzhuView(YiyuanjinzhuEntity yiyuanjinzhuEntity){
 	try {
			BeanUtils.copyProperties(this, yiyuanjinzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
