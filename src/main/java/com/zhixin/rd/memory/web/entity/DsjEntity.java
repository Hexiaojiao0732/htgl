package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class DsjEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private String  sjnr;//事件内容
	private  String  sjsj;//事件时间
	private  String sjmc;//事件名称
	private  String sjzp;//事件照片
	@Override
	public String toString() {
		return "DsjEntity [id=" + id + ", sjnr=" + sjnr + ", sjsj=" + sjsj + ", sjmc=" + sjmc + ", sjzp=" + sjzp + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSjnr() {
		return sjnr;
	}
	public void setSjnr(String sjnr) {
		this.sjnr = sjnr;
	}
	public String getSjsj() {
		return sjsj;
	}
	public void setSjsj(String sjsj) {
		this.sjsj = sjsj;
	}
	public String getSjmc() {
		return sjmc;
	}
	public void setSjmc(String sjmc) {
		this.sjmc = sjmc;
	}
	public String getSjzp() {
		return sjzp;
	}
	public void setSjzp(String sjzp) {
		this.sjzp = sjzp;
	}
	
}
