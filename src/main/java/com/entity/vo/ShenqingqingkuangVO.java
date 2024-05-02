package com.entity.vo;

import com.entity.ShenqingqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 申请情况
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 17:03:43
 */
public class ShenqingqingkuangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 星级水平
	 */
	
	private String xingjishuiping;
		
	/**
	 * 识别码
	 */
	
	private String shibiema;
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：星级水平
	 */
	 
	public void setXingjishuiping(String xingjishuiping) {
		this.xingjishuiping = xingjishuiping;
	}
	
	/**
	 * 获取：星级水平
	 */
	public String getXingjishuiping() {
		return xingjishuiping;
	}
				
	
	/**
	 * 设置：识别码
	 */
	 
	public void setShibiema(String shibiema) {
		this.shibiema = shibiema;
	}
	
	/**
	 * 获取：识别码
	 */
	public String getShibiema() {
		return shibiema;
	}
			
}
