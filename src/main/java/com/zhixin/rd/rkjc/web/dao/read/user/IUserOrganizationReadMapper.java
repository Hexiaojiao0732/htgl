package com.zhixin.rd.rkjc.web.dao.read.user;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.OrganizationEntity;
import com.zhixin.rd.rkjc.web.entity.UserEntity;
import com.zhixin.rd.rkjc.web.entity.UserOrganizationEntity;

public interface IUserOrganizationReadMapper {

	List<UserOrganizationEntity> getAllUserOrg() throws Exception;

	Collection<OrganizationEntity> getOrganizationByUserId(Integer userId) throws Exception;

	Collection<UserEntity> getUserInfo(Map<String, Object> params) throws Exception;

	int count(Map<String, Object> params) throws Exception;

	UserEntity getUserInfo1ByUserId(Integer userId) throws Exception;

	UserEntity getUserInfo2ByUserId(Integer userId) throws Exception;

	int insert(UserOrganizationEntity userOrganizationEntity) throws Exception;

	int deleteByUserOrganization(UserOrganizationEntity organizationEntity) throws Exception;

	int deleteByUserId(Integer userId) throws Exception;

	int deleteByOrganizationId(Integer organizationId) throws Exception;

	int insertSelective(UserOrganizationEntity userOrganizationEntity) throws Exception;

	void insertoid(UserOrganizationEntity userOrganizationEntity);
	
	int countOrg(UserOrganizationEntity userOrganizationEntity);
	
	void update(UserOrganizationEntity userOrganizationEntity);
	
	List<UserOrganizationEntity> getOrgByUserId(Integer userId) throws Exception;
	
	List<UserEntity> getUsersByOrgId(Integer organizationId) throws Exception;

	int deleteOrganizationByUserId(Integer id);
	
	List<UserEntity> getUsersByOrgAndType(Integer organizationId, String type) throws Exception;

	List<UserEntity> getUsers(String type) throws Exception;
}