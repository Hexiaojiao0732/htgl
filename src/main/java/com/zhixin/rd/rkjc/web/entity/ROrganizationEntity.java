package com.zhixin.rd.rkjc.web.entity;

public class ROrganizationEntity implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer orgId;
	
	private Integer parentOrgId;
	
	

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Integer getParentOrgId() {
		return parentOrgId;
	}

	public void setParentOrgId(Integer parentOrgId) {
		this.parentOrgId = parentOrgId;
	}

	@Override
	public String toString() {
		return "ROrganizationEntity [orgId=" + orgId + ", parentOrgId=" + parentOrgId + "]";
	}

	
	
	
	
}
