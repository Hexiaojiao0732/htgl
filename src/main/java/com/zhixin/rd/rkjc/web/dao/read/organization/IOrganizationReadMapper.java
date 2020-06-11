package com.zhixin.rd.rkjc.web.dao.read.organization;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.OrganizationEntity;

public interface IOrganizationReadMapper {
    
	public OrganizationEntity load(Integer id);
	
	public List<OrganizationEntity> list(Map<String, Object> map);
	
	public OrganizationEntity selectoname(int oid);

	public List<OrganizationEntity> listChild(Integer parentId);
	
	public OrganizationEntity getOrganizationByUserId(Integer userId);

	public List<OrganizationEntity> listAllOrgAndParent();
	
	public List<OrganizationEntity> listMapOrg();
	
	public List<OrganizationEntity> listOrgByRegionCode(Long regionCode);
	
	public List<OrganizationEntity> listByIds(Map<String, Object> map);

	public int count(Map<String, Object> map);
}