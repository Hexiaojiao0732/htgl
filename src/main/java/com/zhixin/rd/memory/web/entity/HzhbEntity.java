package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class HzhbEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private  String  mc;//名称
	private  String  tp;//图片
	private  String jj;//简介
	private  String dlyhm;//登录用户名
	private  String  dlmm;//登录密码
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	public String getJj() {
		return jj;
	}
	public void setJj(String jj) {
		this.jj = jj;
	}
	public String getDlyhm() {
		return dlyhm;
	}
	public void setDlyhm(String dlyhm) {
		this.dlyhm = dlyhm;
	}
	public String getDlmm() {
		return dlmm;
	}
	public void setDlmm(String dlmm) {
		this.dlmm = dlmm;
	}
	@Override
	public String toString() {
		return "HzhbEntity [id=" + id + ", mc=" + mc + ", tp=" + tp + ", jj=" + jj + ", dlyhm=" + dlyhm + ", dlmm="
				+ dlmm + "]";
	}
	
}
