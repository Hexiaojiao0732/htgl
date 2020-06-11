package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;

public class XmSpEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String mc;
	
	private String wyid;
	
	private String pssj;
	
	private String psdd;
	
	private String jj;
	
	private String spzp;
	
	private Long xmId;
	
	private String cjsj;

	private String sjUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMc() {
		return mc;
	}

	public void setMc(String mc) {
		this.mc = mc;
	}

	public String getWyid() {
		return wyid;
	}

	public void setWyid(String wyid) {
		this.wyid = wyid;
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

	public String getSpzp() {
		return spzp;
	}

	public void setSpzp(String spzp) {
		this.spzp = spzp;
	}

	public Long getXmId() {
		return xmId;
	}

	public void setXmId(Long xmId) {
		this.xmId = xmId;
	}

	public String getCjsj() {
		return cjsj;
	}

	public void setCjsj(String cjsj) {
		this.cjsj = cjsj;
	}


	public String getSjUrl() {
		return sjUrl;
	}

	public void setSjUrl(String sjUrl) {
		this.sjUrl = sjUrl;
	}
}
