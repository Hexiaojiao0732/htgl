package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 身份信息
 * Created by yangyk on 17-7-18
 */
public class SfxxEntity implements Serializable {
	private long id;
	private String zjhm;		//证件号码
	private String cyzjdm;		//常用证件代码
	private String ms;			//事件描述
	private String ly;			//来源
	private String ywsj;		//业务时间
	private Date rksj;			//入库时间
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
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
		return "SfxxEntity [id=" + id + ", zjhm=" + zjhm + ", cyzjdm=" + cyzjdm
				+ ", ms=" + ms + ", ly=" + ly + ", ywsj=" + ywsj + ", rksj="
				+ rksj + "]";
	}

	
}
