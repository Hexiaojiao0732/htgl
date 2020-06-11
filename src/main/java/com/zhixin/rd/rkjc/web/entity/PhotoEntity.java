package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class PhotoEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private byte[] photoBytes;
	private String base64File;
	private Date djrq;
	private String fw;
	private String ly;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public byte[] getPhotoBytes() {
		return photoBytes;
	}
	public void setPhotoBytes(byte[] photoBytes) {
		this.photoBytes = photoBytes;
	}
	public String getBase64File() {
		return base64File;
	}
	public void setBase64File(String base64File) {
		this.base64File = base64File;
	}


	public String getLy() {
		return ly;
	}

	public void setLy(String ly) {
		this.ly = ly;
	}

	public Date getDjrq() {
		return djrq;
	}

	public void setDjrq(Date djrq) {
		this.djrq = djrq;
	}

	public String getFw() {
		return fw;
	}

	public void setFw(String fw) {
		this.fw = fw;
	}
}
