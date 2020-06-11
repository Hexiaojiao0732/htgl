/*
 * FileName: IPqaWfryMysqlService.java
 * auto create by wangguhua
 * Author:   
 * Description: PqaWfryMysqlService实体类   
 */

package com.zhixin.rd.rkjc.web.service.dq;

import com.zhixin.rd.rkjc.web.entity.DqResultEntity;
import com.zhixin.rd.rkjc.web.form.ParamForm;

import java.util.List;

public interface INewJZptDqMysqlService {

	/**
	 * 获取盗窃嫌疑人信息
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<DqResultEntity> listAjXyrxxPq(ParamForm form) throws Exception;

}