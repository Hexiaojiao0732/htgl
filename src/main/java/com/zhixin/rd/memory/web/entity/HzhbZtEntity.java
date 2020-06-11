package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class HzhbZtEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private String ztMc;//专题名称
	private String xmMc;//项目名称
	private String xmjj;//项目简介
	private String  xmFzr;//项目负责人
	private String lxdh;//联系电话
	private String yx;//邮箱
	private String zt;//状态0未审核  1已审核
	private String hzhbId;//合作伙伴Id
	private String zp;//预览图图片\
	private String hzhbmc;
	private String gzwjDz;
	
	public String getHzhbmc() {
		return hzhbmc;
	}
	public void setHzhbmc(String hzhbmc) {
		this.hzhbmc = hzhbmc;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getZtMc() {
		return ztMc;
	}
	public void setZtMc(String ztMc) {
		this.ztMc = ztMc;
	}
	public String getXmMc() {
		return xmMc;
	}
	public void setXmMc(String xmMc) {
		this.xmMc = xmMc;
	}
	public String getXmjj() {
		return xmjj;
	}
	public void setXmjj(String xmjj) {
		this.xmjj = xmjj;
	}
	public String getXmFzr() {
		return xmFzr;
	}
	public void setXmFzr(String xmFzr) {
		this.xmFzr = xmFzr;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getYx() {
		return yx;
	}
	public void setYx(String yx) {
		this.yx = yx;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public String getHzhbId() {
		return hzhbId;
	}
	public void setHzhbId(String hzhbId) {
		this.hzhbId = hzhbId;
	}
	public String getZp() {
		return zp;
	}
	public void setZp(String zp) {
		this.zp = zp;
	}
	@Override
	public String toString() {
		return "HzhbZtEntity [id=" + id + ", ztMc=" + ztMc + ", xmMc=" + xmMc + ", xmjj=" + xmjj + ", xmFzr=" + xmFzr
				+ ", lxdh=" + lxdh + ", yx=" + yx + ", zt=" + zt + ", hzhbId=" + hzhbId + ", zp=" + zp + ", hzhbmc="
				+ hzhbmc + "]";
	}

	public String getGzwjDz() {
		return gzwjDz;
	}

	public void setGzwjDz(String gzwjDz) {
		this.gzwjDz = gzwjDz;
	}
}
