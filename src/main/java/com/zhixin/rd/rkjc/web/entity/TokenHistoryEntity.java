package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.sql.Date;

//历史表
public class TokenHistoryEntity implements Serializable {
	private Long id;

	private Long applicationId;// application_id

	private String tokenValue;// 历史token值
	
	private Long status;// 状态

	private Date createTime;// 生效时间

	private Date cancelTime;// 失效时间

	public TokenHistoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TokenHistoryEntity(Long id, Long applicationId, String tokenValue, Long status, Date createTime,
			Date cancelTime) {
		super();
		this.id = id;
		this.applicationId = applicationId;
		this.tokenValue = tokenValue;
		this.status = status;
		this.createTime = createTime;
		this.cancelTime = cancelTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public String getTokenValue() {
		return tokenValue;
	}

	public void setTokenValue(String tokenValue) {
		this.tokenValue = tokenValue;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCancelTime() {
		return cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	@Override
	public String toString() {
		return "TokenHistoryEntity [id=" + id + ", applicationId=" + applicationId + ", tokenValue=" + tokenValue
				+ ", status=" + status + ", createTime=" + createTime + ", cancelTime=" + cancelTime + "]";
	}

	
}
