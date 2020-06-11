package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class GxzEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private String  xm;//姓名
	private  String  jj;//简介
	private  String zp;//照片
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getJj() {
		return jj;
	}
	public void setJj(String jj) {
		this.jj = jj;
	}
	public String getZp() {
		return zp;
	}
	public void setZp(String zp) {
		this.zp = zp;
	}
	@Override
	public String toString() {
		return "GxzEntity [id=" + id + ", xm=" + xm + ", jj=" + jj + ", zp=" + zp + "]";
	}
	
}
