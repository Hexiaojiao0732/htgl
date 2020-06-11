package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class PlEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private  String  nr;//评论内容
	private String plsj;//评论时间
	private String userId;//评论用户
	private  int spId;//评论视频标识
	private int ypId;//评论音频标识
	private  int hzhbZyId;//评论合作伙伴资源标识
	private  int cbwId;//评论出版物id
	private String spmc;
	private  String  ypmc;
	private  String cbwmc;
	private  String  wjmc;
	private  String  xm;
	private int zt;//状态
	
	
	public int getZt() {
		return zt;
	}
	public void setZt(int zt) {
		this.zt = zt;
	}
	public String getSpmc() {
		return spmc;
	}
	public void setSpmc(String spmc) {
		this.spmc = spmc;
	}
	public String getYpmc() {
		return ypmc;
	}
	public void setYpmc(String ypmc) {
		this.ypmc = ypmc;
	}
	public String getCbwmc() {
		return cbwmc;
	}
	public void setCbwmc(String cbwmc) {
		this.cbwmc = cbwmc;
	}
	public String getWjmc() {
		return wjmc;
	}
	public void setWjmc(String wjmc) {
		this.wjmc = wjmc;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNr() {
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
	public String getPlsj() {
		return plsj;
	}
	public void setPlsj(String plsj) {
		this.plsj = plsj;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getSpId() {
		return spId;
	}
	public void setSpId(int spId) {
		this.spId = spId;
	}
	public int getYpId() {
		return ypId;
	}
	public void setYpId(int ypId) {
		this.ypId = ypId;
	}
	public int getHzhbZyId() {
		return hzhbZyId;
	}
	public void setHzhbZyId(int hzhbZyId) {
		this.hzhbZyId = hzhbZyId;
	}
	public int getCbwId() {
		return cbwId;
	}
	public void setCbwId(int cbwId) {
		this.cbwId = cbwId;
	}
	@Override
	public String toString() {
		return "PlEntity [id=" + id + ", nr=" + nr + ", plsj=" + plsj + ", userId=" + userId + ", spId=" + spId
				+ ", ypId=" + ypId + ", hzhbZyId=" + hzhbZyId + ", cbwId=" + cbwId + ", spmc=" + spmc + ", ypmc=" + ypmc
				+ ", cbwmc=" + cbwmc + ", wjmc=" + wjmc + ", xm=" + xm + ", zt=" + zt + "]";
	}
	
}
