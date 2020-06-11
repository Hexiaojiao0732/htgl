package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class RoleEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String ROLE_SUPER_ADMIN = "系统维护人员";
	public static final String ROLE_ADMIN = "管理员";
	public static final String ROLE_AREA_USER = "办案场所人员";
	public static final String ROLE_CASE_USER = "办案人员";
	public static final String ROLE_LEADER = "公安领导";
	public static final String ROLE_LAW = "法制人员";
	public static final String ROLE_999 = "999体检人员";
	public static final String ROLE_COMBINE = "合成作战人员";

	public static final int DATA_AUTH_SELF = 0;// 0本人
	public static final int DATA_AUTH_SELFAREA = 1;// 1本办案场所
	public static final int DATA_AUTH_DOWN_CASCADEAREA = 2;// 2本办案场所及下级办案场所
	public static final int DATA_AUTH_UP_CASCADEAREA = 3;// 3上级办案场所及其下级办案场所
	public static final int DATA_AUTH_FULL = 4;// 4全部
	public static final int DATA_AUTH_SELFORG = 5;// 1本部门
	public static final int DATA_AUTH_DOWN_CASCADEORG = 6;// 2本部门及下级部门
	public static final int DATA_AUTH_UP_CASCADEORG = 7;// 3上级部门及其下级部门

	private Integer id;

	private String name;

	private String description;

	private int dataAuth;

	private Date createdTime;

	private Date updatedTime;

	private Boolean isSelect = false;

	public Boolean getIsSelect() {
		return isSelect;
	}

	public void setIsSelect(Boolean isSelect) {
		this.isSelect = isSelect;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	@Override
	public String toString() {
		return "RoleEntity [id=" + id + ", name=" + name + ", description=" + description + ", createdTime="
				+ createdTime + ", updatedTime=" + updatedTime + ", isSelect=" + isSelect + "]";
	}

	public int getDataAuth() {
		return dataAuth;
	}

	public void setDataAuth(int dataAuth) {
		this.dataAuth = dataAuth;
	}
}