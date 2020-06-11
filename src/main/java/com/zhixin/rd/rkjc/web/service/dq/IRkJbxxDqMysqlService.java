/*
 * FileName: IPqaWfryWsMysqlService.java
 * auto create by wangguhua
 * Author:   
 * Description: PqaWfryWsMysqlService实体类   
 */
 
package com.zhixin.rd.rkjc.web.service.dq;



import com.zhixin.rd.rkjc.web.entity.DqResultEntity;
import com.zhixin.rd.rkjc.web.entity.PqResultEntity;
import com.zhixin.rd.rkjc.web.entity.RkCXEntity;
import com.zhixin.rd.rkjc.web.form.ParamForm;

import java.util.List;
import java.util.Map;

public interface IRkJbxxDqMysqlService {

	public 	List<DqResultEntity> listAllRkJbxxPq(ParamForm form) throws Exception;

	public  DqResultEntity  queryOneBySfzh(ParamForm form)throws Exception;

	Long listCount(ParamForm form);
	
	public List<RkCXEntity> getSjly() throws Exception;

    public Map<String,Object> getSqrk() throws Exception;
    
    public List<RkCXEntity> getDq() throws Exception;
}