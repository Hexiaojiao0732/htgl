package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.Date;

import javax.sql.rowset.Predicate;

public class SyYjEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;// 主键ID
	private String nr;// neirong 
	private String tjsj;// 提交时间
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNr() {
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
	public String getTjsj() {
		return tjsj;
	}
	public void setTjsj(String tjsj) {
		this.tjsj = tjsj;
	}
	@Override
	public String toString() {
		return "SyYjEntity [id=" + id + ", nr=" + nr + ", tjsj=" + tjsj + "]";
	}
	



}
