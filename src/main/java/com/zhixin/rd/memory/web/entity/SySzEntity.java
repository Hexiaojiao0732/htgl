package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class SySzEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private String lx;//首页类型
	private String z;//值
	private String bz;//备注
	private String mc;//备注
	private String spzp;//备注
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public String getSpzp() {
		return spzp;
	}
	public void setSpzp(String spzp) {
		this.spzp = spzp;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getLx() {
		return lx;
	}
	public void setLx(String lx) {
		this.lx = lx;
	}
	public String getZ() {
		return z;
	}
	public void setZ(String z) {
		this.z = z;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	@Override
	public String toString() {
		return "SySzEntity [id=" + id + ", lx=" + lx + ", z=" + z + ", bz=" + bz + ", mc=" + mc + ", spzp=" + spzp
				+ "]";
	}
	
}
