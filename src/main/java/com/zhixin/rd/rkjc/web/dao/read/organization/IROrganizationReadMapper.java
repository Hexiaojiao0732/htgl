package com.zhixin.rd.rkjc.web.dao.read.organization;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.OrganizationEntity;
import com.zhixin.rd.rkjc.web.entity.ROrganizationEntity;

public interface IROrganizationReadMapper {
    
	public List<OrganizationEntity> listParent(Map<String, Object> map);
	
	public List<OrganizationEntity> parentCount(Map<String, Object> map);
	
	public List<OrganizationEntity> listChild(Map<String, Object> map);
	
	public List<OrganizationEntity> childCount(Map<String, Object> map);
	
	public List<ROrganizationEntity> listOrganizations();

	public List<Integer> listParentId(Integer orgId);

}