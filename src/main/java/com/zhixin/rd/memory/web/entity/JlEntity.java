package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.Date;

import javax.sql.rowset.Predicate;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class JlEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private  int ssztId;//所属专题ID
	private int dyS;//地域 省
	private int dyC;//地域 市
	private int dyX;//地域 县区
	private String  yz;//语种
	private String zt; //载体
	private int sc;//时长
	private  String mc;//名称
	private String pssj;//拍摄时间
	private String psdd; //拍摄地点
	private String jj;//简介
	private  String wzjj;//完整简介
	private  String jltp;//记录图片
	private  String fl;//分类
	public int getSsztId() {
		return ssztId;
	}
	public void setSsztId(int ssztId) {
		this.ssztId = ssztId;
	}
	public int getDyS() {
		return dyS;
	}
	public void setDyS(int dyS) {
		this.dyS = dyS;
	}
	public int getDyC() {
		return dyC;
	}
	public void setDyC(int dyC) {
		this.dyC = dyC;
	}
	public int getDyX() {
		return dyX;
	}
	public void setDyX(int dyX) {
		this.dyX = dyX;
	}
	public String getYz() {
		return yz;
	}
	public void setYz(String yz) {
		this.yz = yz;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public int getSc() {
		return sc;
	}
	public void setSc(int sc) {
		this.sc = sc;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public String getPssj() {
		return pssj;
	}
	public void setPssj(String pssj) {
		this.pssj = pssj;
	}
	public String getPsdd() {
		return psdd;
	}
	public void setPsdd(String psdd) {
		this.psdd = psdd;
	}
	public String getJj() {
		return jj;
	}
	public void setJj(String jj) {
		this.jj = jj;
	}
	public String getWzjj() {
		return wzjj;
	}
	public void setWzjj(String wzjj) {
		this.wzjj = wzjj;
	}
	public String getJltp() {
		return jltp;
	}
	public void setJltp(String jltp) {
		this.jltp = jltp;
	}
	public String getFl() {
		return fl;
	}
	public void setFl(String fl) {
		this.fl = fl;
	}
	@Override
	public String toString() {
		return "JlEntity [id=" + id + ", ssztId=" + ssztId + ", dyS=" + dyS + ", dyC=" + dyC + ", dyX=" + dyX + ", yz="
				+ yz + ", zt=" + zt + ", sc=" + sc + ", mc=" + mc + ", pssj=" + pssj + ", psdd=" + psdd + ", jj=" + jj
				+ ", wzjj=" + wzjj + ", jltp=" + jltp + ", fl=" + fl + "]";
	}

}
