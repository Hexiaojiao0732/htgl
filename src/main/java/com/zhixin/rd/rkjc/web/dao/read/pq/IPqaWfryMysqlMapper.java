/*
 * FileName: PqaWfryMysqlEntity.java
 * auto create by wangguhua 2016
 * Author:   
 * Date:     2017-5-8 17:11:50
 * Description: IPqaWfryMysqlMapper实体类   
 */
 
package com.zhixin.rd.rkjc.web.dao.read.pq;


import java.util.List;
import java.util.Map;
import com.zhixin.rd.rkjc.entity.mysql.PqaWfryMysqlEntity;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * 实体类IPqaWfryMysqlMapper table: pqa_wfry
 * 
 * @author wangguhua
 */
public interface IPqaWfryMysqlMapper  {

	public List<PqaWfryMysqlEntity> listAllPqaWfry(Map<String,String> map) throws Exception;
	

    
    

}