package com.entity.vo;

import com.entity.YiyuanjinzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 医院进驻
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 17:03:43
 */
public class YiyuanjinzhuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医疗条件
	 */
	
	private String yiliaotiaojian;
		
	/**
	 * 营业执照
	 */
	
	private String yingyezhizhao;
		
	/**
	 * 资质证书
	 */
	
	private String zizhizhengshu;
		
	/**
	 * 医院介绍
	 */
	
	private String yiyuanjieshao;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：医疗条件
	 */
	 
	public void setYiliaotiaojian(String yiliaotiaojian) {
		this.yiliaotiaojian = yiliaotiaojian;
	}
	
	/**
	 * 获取：医疗条件
	 */
	public String getYiliaotiaojian() {
		return yiliaotiaojian;
	}
				
	
	/**
	 * 设置：营业执照
	 */
	 
	public void setYingyezhizhao(String yingyezhizhao) {
		this.yingyezhizhao = yingyezhizhao;
	}
	
	/**
	 * 获取：营业执照
	 */
	public String getYingyezhizhao() {
		return yingyezhizhao;
	}
				
	
	/**
	 * 设置：资质证书
	 */
	 
	public void setZizhizhengshu(String zizhizhengshu) {
		this.zizhizhengshu = zizhizhengshu;
	}
	
	/**
	 * 获取：资质证书
	 */
	public String getZizhizhengshu() {
		return zizhizhengshu;
	}
				
	
	/**
	 * 设置：医院介绍
	 */
	 
	public void setYiyuanjieshao(String yiyuanjieshao) {
		this.yiyuanjieshao = yiyuanjieshao;
	}
	
	/**
	 * 获取：医院介绍
	 */
	public String getYiyuanjieshao() {
		return yiyuanjieshao;
	}
				
	
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
