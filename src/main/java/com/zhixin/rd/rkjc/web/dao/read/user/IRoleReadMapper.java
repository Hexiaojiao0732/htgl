package com.zhixin.rd.rkjc.web.dao.read.user;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zhixin.rd.rkjc.web.entity.RoleAuthorityEntity;
import com.zhixin.rd.rkjc.web.entity.RoleEntity;

public interface IRoleReadMapper {
	
	/**
	 * 根据用户id获取角色信息
	 * @param params
	 * @return
	 * @throws Exception
	 */
	Collection<RoleEntity> getUserRolesByUserIDMap(Map<String, Object> params) throws Exception;
	
	Collection<RoleEntity> getUserRolesByUserID(Integer userID) throws Exception;
	
	Collection<RoleEntity> getAllRolesByMap(Map<String, Object> params) throws Exception;
	
	Collection<RoleEntity> getAllRoles() throws Exception;
	
	Collection<RoleEntity> getRolesByLike(Map<String, Object> params) throws Exception;
	
	int count(Map<String, Object> params) throws Exception;
	
	RoleEntity getRoleByID(Integer id) throws Exception;

	int deleteRoleByID(Integer id) throws Exception;

    int insertRole(RoleEntity role) throws Exception;

    int updateRoleByID(RoleEntity role) throws Exception;

    int insertSelectiveRole(RoleEntity role) throws Exception;

    int updateSelectiveRoleByID(RoleEntity role) throws Exception;
    
    Collection<RoleAuthorityEntity> getAllRoleAuthority() throws Exception;

}