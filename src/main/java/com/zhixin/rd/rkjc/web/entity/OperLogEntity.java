package com.zhixin.rd.rkjc.web.entity;

import java.util.Date;

public class OperLogEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	public static final String INSERT_TYPE = "add";
	public static final String EDIT_TYPE = "edit";
	public static final String DELETE_TYPE = "delete";
	public static final String RMI_TYPE = "rmi";
	public static final String UPLOAD_TYPE = "upload";
	public static final String DOWNLOAD_TYPE = "download";
	public static final String OTHER_TYPE = "other";

	private Long id;
	private String type;
	private String content;
	private String user;
	private Date operTime;
	private Boolean isSuccess;

	@Override
	public String toString() {
		return "OperLogEntity [id=" + id + ", type=" + type + ", content=" + content + ", user=" + user + ", operTime="
				+ operTime + ", isSuccess=" + isSuccess + "]";
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getOperTime() {
		return operTime;
	}

	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}

}
