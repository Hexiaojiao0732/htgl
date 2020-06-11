package com.zhixin.rd.rkjc.web.dao.read.user;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhixin.rd.rkjc.web.entity.UserRoleEntity;

@Repository("UserRoleMapper")
public interface IUserRoleMapper {

	Collection<UserRoleEntity> getAllUserRole() throws Exception;

	int deleteUserRole(UserRoleEntity entity) throws Exception;

	int insertUserRole(UserRoleEntity entity) throws Exception;

	int insertSelectiveUserRole(UserRoleEntity entity) throws Exception;
	
	int deleteUserRoleByUserID(Integer userId) throws Exception;
	
	Collection<UserRoleEntity> getUserRoleByUserId(Integer userId) throws Exception;

	List<UserRoleEntity> queryRoleByUser(Integer id);

	int deleteUserRoleById(Integer id);
}