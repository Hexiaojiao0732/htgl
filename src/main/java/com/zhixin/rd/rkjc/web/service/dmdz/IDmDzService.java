package com.zhixin.rd.rkjc.web.service.dmdz;

import com.zhixin.rd.rkjc.web.entity.DmDzEntity;

import java.util.List;
import java.util.Map;


public interface IDmDzService {

	/**
	 * @param level 1省 2城市 3区县 4街道镇;
	 *  
	 * @param parentId
	 */
    List<DmDzEntity> list(Map<String, Object> map);

  
}