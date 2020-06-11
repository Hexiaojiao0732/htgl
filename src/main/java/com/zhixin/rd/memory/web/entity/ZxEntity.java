package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.Date;

import javax.sql.rowset.Predicate;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class ZxEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String bt;//标题
	private  String fssj;//发送时间
	private  String nr;//内容
	private String  tp;//图片
	private  String  dlx;//大类型（1学术信息、2新闻动态）
	private  String zlx;//子类型（待定）
	private String  xsurl;//学术url
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBt() {
		return bt;
	}
	public void setBt(String bt) {
		this.bt = bt;
	}
	public String getFssj() {
		return fssj;
	}
	public void setFssj(String fssj) {
		this.fssj = fssj;
	}
	public String getNr() {
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	public String getDlx() {
		return dlx;
	}
	public void setDlx(String dlx) {
		this.dlx = dlx;
	}
	public String getZlx() {
		return zlx;
	}
	public void setZlx(String zlx) {
		this.zlx = zlx;
	}
	public String getXsurl() {
		return xsurl;
	}
	public void setXsurl(String xsurl) {
		this.xsurl = xsurl;
	}
	@Override
	public String toString() {
		return "ZxEntity [id=" + id + ", bt=" + bt + ", fssj=" + fssj + ", nr=" + nr + ", tp=" + tp + ", dlx=" + dlx
				+ ", zlx=" + zlx + ", xsurl=" + xsurl + "]";
	}
	
}
