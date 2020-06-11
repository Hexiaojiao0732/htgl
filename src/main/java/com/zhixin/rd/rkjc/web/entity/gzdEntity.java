package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class gzdEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//ID
	private String fwIp;//访问ip
	private String gzmjJh;//关注民警警号
	private String gzmjXm;//关注民警姓名
	private String xyrSfzh;//嫌疑人身份证号
	private String gzsj;//关注时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFwIp() {
		return fwIp;
	}
	public void setFwIp(String fwIp) {
		this.fwIp = fwIp;
	}
	public String getGzmjJh() {
		return gzmjJh;
	}
	public void setGzmjJh(String gzmjJh) {
		this.gzmjJh = gzmjJh;
	}
	public String getGzmjXm() {
		return gzmjXm;
	}
	public void setGzmjXm(String gzmjXm) {
		this.gzmjXm = gzmjXm;
	}
	public String getXyrSfzh() {
		return xyrSfzh;
	}
	public void setXyrSfzh(String xyrSfzh) {
		this.xyrSfzh = xyrSfzh;
	}
	public String getGzsj() {
		return gzsj;
	}
	public void setGzsj(String gzsj) {
		this.gzsj = gzsj;
	}
	@Override
	public String toString() {
		return "gzdEntity [id=" + id + ", fwIp=" + fwIp + ", gzmjJh=" + gzmjJh + ", gzmjXm=" + gzmjXm + ", xyrSfzh="
				+ xyrSfzh + ", gzsj=" + gzsj + "]";
	}
	

	
}