package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;


public class TpEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String xmId;
	private  String ip;
	private  String createTime;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getXmId() {
		return xmId;
	}

	public void setXmId(String xmId) {
		this.xmId = xmId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "ZxEntity [id=" + id + ", xmId=" + xmId + ", ip=" + ip + ", createTime=" + createTime + "]";
	}
	
}
