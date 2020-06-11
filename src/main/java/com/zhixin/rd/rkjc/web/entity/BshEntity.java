package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 标识号
 * Created by yangyk on 2017/7/20.
 */
public class BshEntity implements Serializable {
	private Integer id;		
	private String zjhm;	//证件号码
	private String cyzjdm;	//常用证件代码
	private String fwbshmc;	//服务标识号名称
	private String fwbsh;	//服务标识号
	private String ly;		//来源
	private String ywsj;	//业务时间
	private Date rksj;		//入库时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getZjhm() {
		return zjhm;
	}
	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}
	public String getCyzjdm() {
		return cyzjdm;
	}
	public void setCyzjdm(String cyzjdm) {
		this.cyzjdm = cyzjdm;
	}
	public String getFwbshmc() {
		return fwbshmc;
	}
	public void setFwbshmc(String fwbshmc) {
		this.fwbshmc = fwbshmc;
	}
	public String getFwbsh() {
		return fwbsh;
	}
	public void setFwbsh(String fwbsh) {
		this.fwbsh = fwbsh;
	}
	public String getLy() {
		return ly;
	}
	public void setLy(String ly) {
		this.ly = ly;
	}
	public String getYwsj() {
		return ywsj;
	}
	public void setYwsj(String ywsj) {
		this.ywsj = ywsj;
	}
	public Date getRksj() {
		return rksj;
	}
	public void setRksj(Date rksj) {
		this.rksj = rksj;
	}
	@Override
	public String toString() {
		return "BshEntity [id=" + id + ", zjhm=" + zjhm + ", cyzjdm=" + cyzjdm
				+ ", fwbshmc=" + fwbshmc + ", fwbsh=" + fwbsh + ", ly=" + ly
				+ ", ywsj=" + ywsj + ", rksj=" + rksj + "]";
	}
	
	
}
