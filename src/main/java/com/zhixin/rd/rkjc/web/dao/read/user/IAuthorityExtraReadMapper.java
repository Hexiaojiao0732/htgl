/*
 * FileName: AuthorityExtraEntity.java
 * auto create by wangguhua 2016
 * Author:   
 * Date:     2016-7-25 16:18:44
 * Description: AuthorityExtraMapper实体类   
 */
 
package com.zhixin.rd.rkjc.web.dao.read.user;


import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.AuthorityExtraEntity;

/**
 * 实体类AuthorityExtraMapper table: authority_extra
 * 
 * @author wangguhua
 */
public interface IAuthorityExtraReadMapper {

	public List<AuthorityExtraEntity> listAllAuthorityExtra() throws Exception;
	
	public Integer countAllAuthorityExtra() throws Exception;
	
	public AuthorityExtraEntity getAuthorityExtraById(Long id) throws Exception;
	
	public List<AuthorityExtraEntity> listAuthorityExtraByAreaId(Long areaId) throws Exception;
	
	/**
	 * 根据  areaId userId获取AuthorityExtra
	 * @return
	 */
	public List<AuthorityExtraEntity> listAuthorityExtraByAreaIdAndUserId(Map<String, Object> param) throws Exception;

}