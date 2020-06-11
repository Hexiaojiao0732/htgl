package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class CbwEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private String mc;// 名称
	private String tp;// 图片
	private String zz;// 作者
	private String ms;// 描述
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
	public String getZz() {
		return zz;
	}
	public void setZz(String zz) {
		this.zz = zz;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	@Override
	public String toString() {
		return "CbwEntity [id=" + id + ", mc=" + mc + ", tp=" + tp + ", zz=" + zz + ", ms=" + ms + "]";
	}
	
}
