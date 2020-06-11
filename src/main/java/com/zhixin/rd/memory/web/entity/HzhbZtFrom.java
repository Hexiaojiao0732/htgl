package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class HzhbZtFrom implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private String zp;//预览图图片\
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getZp() {
		return zp;
	}
	public void setZp(String zp) {
		this.zp = zp;
	}
	@Override
	public String toString() {
		return "HzhbZtFrom [id=" + id + ", zp=" + zp + "]";
	}
	
}
