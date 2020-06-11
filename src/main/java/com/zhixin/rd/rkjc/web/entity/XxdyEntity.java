package com.zhixin.rd.rkjc.web.entity;

import java.util.Date;
public class XxdyEntity implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;	//id标识
	private String xyrXm;	//嫌疑人姓名
	private String xyrSfzh;	//嫌疑人身份证号码
	private String gzrJh;		//关注人警号
	private String gzrXm;	//关注人姓名
	private String msnr;	//描述内容
	public String getMsnr() {
		return msnr;
	}
	public void setMsnr(String msnr) {
		this.msnr = msnr;
	}
	private Date cjsj;     //创建时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getXyrXm() {
		return xyrXm;
	}
	public void setXyrXm(String xyrXm) {
		this.xyrXm = xyrXm;
	}
	public String getXyrSfzh() {
		return xyrSfzh;
	}
	public void setXyrSfzh(String xyrSfzh) {
		this.xyrSfzh = xyrSfzh;
	}
	public String getGzrJh() {
		return gzrJh;
	}
	public void setGzrJh(String gzrJh) {
		this.gzrJh = gzrJh;
	}
	public String getGzrXm() {
		return gzrXm;
	}
	public void setGzrXm(String gzrXm) {
		this.gzrXm = gzrXm;
	}
	public Date getCjsj() {
		return cjsj;
	}
	public void setCjsj(Date cjsj) {
		this.cjsj = cjsj;
	}
	@Override
	public String toString() {
		return "XxdyEntity [id=" + id + ", xyrXm=" + xyrXm + ", xyrSfzh=" + xyrSfzh + ", gzrJh=" + gzrJh + ", gzrXm="
				+ gzrXm + ", msnr=" + msnr + ", cjsj=" + cjsj + "]";
	}
	
	
}
