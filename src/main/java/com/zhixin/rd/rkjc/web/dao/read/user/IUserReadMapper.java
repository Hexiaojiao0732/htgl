package com.zhixin.rd.rkjc.web.dao.read.user;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.UserEntity;

public interface IUserReadMapper {

	int deleteUserByID(Integer id) throws Exception;

	Collection<UserEntity> getAllUsers() throws Exception;

//	List<WSUser> getAllUserAndOrgId() throws Exception;

	int insertUser(UserEntity user) throws Exception;

	int insertSelectiveUser(UserEntity user) throws Exception;

	UserEntity getUserByID(Integer id) throws Exception;
	
	UserEntity getUserByCertificateNo(String certificateNo) throws Exception;

	int updateUserByID(UserEntity user) throws Exception;

	int updateSelectiveUserByID(UserEntity user) throws Exception;

	Collection<UserEntity> getUsersByLike(Map<String, Object> params) throws Exception;

	int count(Map<String, Object> params) throws Exception;
	
	UserEntity getUserByLoginNameAndPassword(Map<String, Object> params) throws Exception;

	UserEntity selectinfo(String dd);

	UserEntity getoldPsw(UserEntity entity);

	void updatePsw(UserEntity entity);

	UserEntity getnewPsw(UserEntity entity);

//	List<WSUser> listWSUsers(Map<String, Object> params);

	List<Long> getUserIdsByRole(Long roleId);

	UserEntity queryUserNoById(Long pid);
	
	void updateMobileNo(UserEntity entity);
	
	
	List<UserEntity> queryPoliceByCuffNo(Map<String, Object> params);
	
	List<UserEntity> queryPoliceByCardNo(String cuffNo);
	
	
}