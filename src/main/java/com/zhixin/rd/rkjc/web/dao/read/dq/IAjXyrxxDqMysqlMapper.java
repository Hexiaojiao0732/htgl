/*
 * FileName: AjXyrxxMysqlEntity.java
 * auto create by wangguhua 2016
 * Author:   
 * Date:     2017-5-8 19:43:13
 * Description: IAjXyrxxMysqlMapper实体类   
 */
 
package com.zhixin.rd.rkjc.web.dao.read.dq;


import com.zhixin.rd.rkjc.entity.mysql.AjXyrxxMysqlEntity;

import java.util.List;
import java.util.Map;

public interface IAjXyrxxDqMysqlMapper {

	
	public List<AjXyrxxMysqlEntity> listAjXyrxxDq(Map<String, String> map) throws Exception;
	
}