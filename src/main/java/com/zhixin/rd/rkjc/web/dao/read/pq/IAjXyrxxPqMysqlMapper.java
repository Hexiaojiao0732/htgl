/*
 * FileName: AjXyrxxMysqlEntity.java
 * auto create by wangguhua 2016
 * Author:   
 * Date:     2017-5-8 19:43:13
 * Description: IAjXyrxxMysqlMapper实体类   
 */
 
package com.zhixin.rd.rkjc.web.dao.read.pq;


import java.util.List;
import java.util.Map;
import com.zhixin.rd.rkjc.entity.mysql.AjXyrxxMysqlEntity;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * 实体类IAjXyrxxMysqlMapper table: aj_xyrxx
 * 
 * @author wangguhua
 */
public interface IAjXyrxxPqMysqlMapper  {

	
	public List<AjXyrxxMysqlEntity> listAjXyrxxPq(Map<String,String> map) throws Exception;
	
}