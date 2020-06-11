package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class WjdcEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private String xm;// 姓名
	private String xb;// 性别
	private String csrq;// 出生日期
	private String lxfs;// 联系方式
	private String szdq;// 所在地区
	private String gznr;// 关注内容
	private String zyyxgjy;// 专业与相关经验
	private String zwyy;// 掌握语言
	private String tgzynr;// 能提供的资源内容
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
	public String getXb() {
		return xb;
	}
	public void setXb(String xb) {
		this.xb = xb;
	}
	public String getCsrq() {
		return csrq;
	}
	public void setCsrq(String csrq) {
		this.csrq = csrq;
	}
	public String getLxfs() {
		return lxfs;
	}
	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
	}
	public String getSzdq() {
		return szdq;
	}
	public void setSzdq(String szdq) {
		this.szdq = szdq;
	}
	public String getGznr() {
		return gznr;
	}
	public void setGznr(String gznr) {
		this.gznr = gznr;
	}
	public String getZyyxgjy() {
		return zyyxgjy;
	}
	public void setZyyxgjy(String zyyxgjy) {
		this.zyyxgjy = zyyxgjy;
	}
	public String getZwyy() {
		return zwyy;
	}
	public void setZwyy(String zwyy) {
		this.zwyy = zwyy;
	}
	public String getTgzynr() {
		return tgzynr;
	}
	public void setTgzynr(String tgzynr) {
		this.tgzynr = tgzynr;
	}
	@Override
	public String toString() {
		return "WjdcEntity [id=" + id + ", xm=" + xm + ", xb=" + xb + ", csrq=" + csrq + ", lxfs=" + lxfs + ", szdq="
				+ szdq + ", gznr=" + gznr + ", zyyxgjy=" + zyyxgjy + ", zwyy=" + zwyy + ", tgzynr=" + tgzynr + "]";
	}
	
}
