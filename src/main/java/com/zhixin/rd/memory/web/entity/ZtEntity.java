package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.Date;

import javax.sql.rowset.Predicate;

public class ZtEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;// 主键ID
	private String ztmc;// 专题名称
	private String kssj;// 开始时间
	private String jssj;// 结束时间
	private String jj;// 简介
	private String zttp;// 专题图片
	private String wzjj;// 完整简介
	private String yxtdwldz;// 原系统的外链地址
	private String xcpsp;// 宣传片视频

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZtmc() {
		return ztmc;
	}

	public void setZtmc(String ztmc) {
		this.ztmc = ztmc;
	}



	public String getKssj() {
		return kssj;
	}

	public void setKssj(String kssj) {
		this.kssj = kssj;
	}

	public String getJssj() {
		return jssj;
	}

	public void setJssj(String jssj) {
		this.jssj = jssj;
	}

	public String getJj() {
		return jj;
	}

	public void setJj(String jj) {
		this.jj = jj;
	}

	public String getZttp() {
		return zttp;
	}

	public void setZttp(String zttp) {
		this.zttp = zttp;
	}

	public String getWzjj() {
		return wzjj;
	}

	public void setWzjj(String wzjj) {
		this.wzjj = wzjj;
	}

	public String getYxtdwldz() {
		return yxtdwldz;
	}

	public void setYxtdwldz(String yxtdwldz) {
		this.yxtdwldz = yxtdwldz;
	}

	public String getXcpsp() {
		return xcpsp;
	}

	public void setXcpsp(String xcpsp) {
		this.xcpsp = xcpsp;
	}

	@Override
	public String toString() {
		return "ZtEntity [id=" + id + ", ztmc=" + ztmc + ", kssj=" + kssj + ", jssj=" + jssj + ", jj=" + jj + ", zttp="
				+ zttp + ", wzjj=" + wzjj + ", yxtdwldz=" + yxtdwldz + ", xcpsp=" + xcpsp + "]";
	}


}
