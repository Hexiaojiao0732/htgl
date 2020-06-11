package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;

public class UserRoleEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long userId;

    private Long roleId;
    
    public UserRoleEntity(){}

    public UserRoleEntity(Long userId, Long roleId) {
    	this.userId = userId;
    	this.roleId = roleId;
	}
    
    public UserRoleEntity(Integer userId, Integer roleId) {
    	if(userId!=null){
    		this.userId = userId.longValue();
    	}
    	if(roleId!=null){
    		this.roleId = roleId.longValue();
    	}
	}

	public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

	@Override
	public String toString() {
		return "UserRoleEntity [userId=" + userId + ", roleId=" + roleId + "]";
	}
	
    
}