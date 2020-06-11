/*
 * FileName: AjJbxxMysqlEntity.java
 * auto create by wangguhua 2016
 * Author:   
 * Date:     2017-5-8 19:43:13
 * Description: IAjJbxxMysqlMapper实体类   
 */
 
package com.zhixin.rd.rkjc.web.dao.read.dq;


import com.zhixin.rd.rkjc.entity.mysql.AjJbxxMysqlEntity;

import java.util.List;
import java.util.Map;

public interface IAjJbxxDqMysqlMapper {

	
	public List<AjJbxxMysqlEntity> listAjJbxxDq(Map<String, Object> map) throws Exception;

	public AjJbxxMysqlEntity getAjJbxxDqByAjbh(Map<String, Object> map) throws Exception;
}