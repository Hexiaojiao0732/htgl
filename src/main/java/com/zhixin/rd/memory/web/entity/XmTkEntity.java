package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;

public class XmTkEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String mc;
	
	private String tpdz;
	
	private Long xmId;
	
	private String cjsj;

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

	public String getTpdz() {
		return tpdz;
	}

	public void setTpdz(String tpdz) {
		this.tpdz = tpdz;
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
	
	

}
