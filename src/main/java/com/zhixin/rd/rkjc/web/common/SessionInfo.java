package com.zhixin.rd.rkjc.web.common;

import java.util.ArrayList;
import java.util.List;

import com.zhixin.rd.rkjc.web.entity.AreaEntity;
import com.zhixin.rd.rkjc.web.entity.OrganizationEntity;
import com.zhixin.rd.rkjc.web.entity.RoleEntity;
import com.zhixin.rd.rkjc.web.entity.UserEntity;

public class SessionInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private UserEntity user;//用户信息
	private RoleEntity role;//角色信息
	private String clientIP;//客户端IP
	private AreaEntity currentArea;//本部门的办案场所信息
	private List<AreaEntity> currentAndSubArea;//本部门下面的所有办案场所
	private List<AreaEntity> superAndSubArea;//上级部门下面的所有办案场所
	private OrganizationEntity currentOrg;//本部门信息
	private List<OrganizationEntity> currentAndSubOrg;//本部门及所有下级部门
	private List<OrganizationEntity> superAndSubOrg;//上级部门及所有下级部门
	
	
	
	@Override
	public String toString() {
		return "SessionInfo [user=" + user + ", role=" + role + ", clientIP=" + clientIP + ", currentArea="
				+ currentArea + ", currentAndSubArea=" + currentAndSubArea + ", superAndSubArea=" + superAndSubArea
				+ ", currentOrg=" + currentOrg + ", currentAndSubOrg=" + currentAndSubOrg + ", superAndSubOrg="
				+ superAndSubOrg + "]";
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	

	public AreaEntity getCurrentArea() {
		return currentArea;
	}

	public void setCurrentArea(AreaEntity currentArea) {
		this.currentArea = currentArea;
	}

	public List<AreaEntity> getCurrentAndSubArea() {
		return currentAndSubArea;
	}

	public void setCurrentAndSubArea(List<AreaEntity> currentAndSubArea) {
		this.currentAndSubArea = currentAndSubArea;
	}

	public List<AreaEntity> getSuperAndSubArea() {
		return superAndSubArea;
	}

	public void setSuperAndSubArea(List<AreaEntity> superAndSubArea) {
		this.superAndSubArea = superAndSubArea;
	}

	public OrganizationEntity getCurrentOrg() {
		return currentOrg;
	}
	
	public List<OrganizationEntity> getCurrentOrgs() {
		List<OrganizationEntity> list=new ArrayList<OrganizationEntity>();
		list.add(currentOrg);
		return list;
	}

	public void setCurrentOrg(OrganizationEntity currentOrg) {
		this.currentOrg = currentOrg;
	}

	public List<OrganizationEntity> getCurrentAndSubOrg() {
		return currentAndSubOrg;
	}

	public void setCurrentAndSubOrg(List<OrganizationEntity> currentAndSubOrg) {
		this.currentAndSubOrg = currentAndSubOrg;
	}

	public List<OrganizationEntity> getSuperAndSubOrg() {
		return superAndSubOrg;
	}

	public void setSuperAndSubOrg(List<OrganizationEntity> superAndSubOrg) {
		this.superAndSubOrg = superAndSubOrg;
	}
}
