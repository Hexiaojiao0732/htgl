/*
 * FileName: PqaWfryWsMysqlEntity.java
 * auto create by wangguhua 2016
 * Author:   
 * Date:     2017-5-8 17:11:50
 * Description: IPqaWfryWsMysqlMapper实体类   
 */
 
package com.zhixin.rd.rkjc.web.dao.read.pq;


import java.util.List;
import java.util.Map;
import com.zhixin.rd.rkjc.entity.mysql.PqaWfryWsMysqlEntity;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * 实体类IPqaWfryWsMysqlMapper table: pqa_wfry_ws
 * 
 * @author wangguhua
 */
public interface IPqaWfryWsMysqlMapper  {

	public List<PqaWfryWsMysqlEntity> listAllPqaWfryWs(Map<String,String> map) throws Exception;
	

    
    

}