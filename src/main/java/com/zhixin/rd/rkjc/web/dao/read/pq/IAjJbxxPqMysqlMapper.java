/*
 * FileName: AjJbxxMysqlEntity.java
 * auto create by wangguhua 2016
 * Author:   
 * Date:     2017-5-8 19:43:13
 * Description: IAjJbxxMysqlMapper实体类   
 */
 
package com.zhixin.rd.rkjc.web.dao.read.pq;


import java.util.List;
import java.util.Map;
import com.zhixin.rd.rkjc.entity.mysql.AjJbxxMysqlEntity;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * 实体类IAjJbxxMysqlMapper table: aj_jbxx
 * 
 * @author wangguhua
 */
public interface IAjJbxxPqMysqlMapper  {

	
	public List<AjJbxxMysqlEntity> listAjJbxxPq(Map<String,Object> map) throws Exception;
	
	
	public AjJbxxMysqlEntity getAjJbxxPqByAjbh(Map<String,Object> map) throws Exception;



}