package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class ZtMapInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private double x;//横坐标
	private double y;//纵坐标
	private  String dd;//地点
	private String ms;//描述
	private  int ztId;//所属专题id
	private  String ztmc;//专题名称
	
	public String getZtmc() {
		return ztmc;
	}
	public void setZtmc(String ztmc) {
		this.ztmc = ztmc;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getDd() {
		return dd;
	}
	public void setDd(String dd) {
		this.dd = dd;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public int getZtId() {
		return ztId;
	}
	public void setZtId(int ztId) {
		this.ztId = ztId;
	}
	@Override
	public String toString() {
		return "ZtMapInfoEntity [id=" + id + ", x=" + x + ", y=" + y + ", dd=" + dd + ", ms=" + ms + ", ztId=" + ztId
				+ ", ztmc=" + ztmc + "]";
	}
	
}
