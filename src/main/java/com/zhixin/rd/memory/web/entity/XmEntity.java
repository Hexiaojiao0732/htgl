package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;

public class XmEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String mc;
	
	private String ccrxm;
	
	private String bh;
	
	private String ccrbh;
	
	private String ccrxb;
	
	private String ccrcsrq;
	
	private int xmlb;//项目类别
	
	private String pc;
	
	private String dy;
	
	private Integer tpCount = 0;

	public Integer getTpCount() {
		return tpCount;
	}

	public void setTpCount(Integer tpCount) {
		this.tpCount = tpCount;
	}

	public String getSsqy() {
		return ssqy;
	}

	public void setSsqy(String ssqy) {
		this.ssqy = ssqy;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getCcrxb() {
		return ccrxb;
	}

	public void setCcrxb(String ccrxb) {
		this.ccrxb = ccrxb;
	}

	private String xmzp;
	
	private String xmjs;
	
	private int isTj;//是否推荐 0否 1是
	
	private String cjsj;
	
	private String sbdqhdw;
	
	private String ssqy;

	private int djl;

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

	public String getCcrxm() {
		return ccrxm;
	}

	public void setCcrxm(String ccrxm) {
		this.ccrxm = ccrxm;
	}

	public String getBh() {
		return bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getCcrbh() {
		return ccrbh;
	}

	public void setCcrbh(String ccrbh) {
		this.ccrbh = ccrbh;
	}

	public String getCcrcsrq() {
		return ccrcsrq;
	}

	public void setCcrcsrq(String ccrcsrq) {
		this.ccrcsrq = ccrcsrq;
	}

	public int getXmlb() {
		return xmlb;
	}

	public void setXmlb(int xmlb) {
		this.xmlb = xmlb;
	}

	public String getXmzp() {
		return xmzp;
	}

	public void setXmzp(String xmzp) {
		this.xmzp = xmzp;
	}

	public String getXmjs() {
		return xmjs;
	}

	public void setXmjs(String xmjs) {
		this.xmjs = xmjs;
	}

	public int getIsTj() {
		return isTj;
	}

	public void setIsTj(int isTj) {
		this.isTj = isTj;
	}

	public String getCjsj() {
		return cjsj;
	}

	public void setCjsj(String cjsj) {
		this.cjsj = cjsj;
	}

	public String getSbdqhdw() {
		return sbdqhdw;
	}

	public void setSbdqhdw(String sbdqhdw) {
		this.sbdqhdw = sbdqhdw;
	}

	public int getDjl() {
		return djl;
	}

	public void setDjl(int djl) {
		this.djl = djl;
	}

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getDy() {
		return dy;
	}

	public void setDy(String dy) {
		this.dy = dy;
	}
	
	
}
