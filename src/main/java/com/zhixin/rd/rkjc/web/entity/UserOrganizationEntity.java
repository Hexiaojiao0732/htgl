package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;

public class UserOrganizationEntity implements Serializable {
    
	private static final long serialVersionUID = 1L;

	private Integer userId;

    private Integer organizationId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }
}