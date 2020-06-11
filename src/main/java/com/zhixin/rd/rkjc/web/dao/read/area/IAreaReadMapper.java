package com.zhixin.rd.rkjc.web.dao.read.area;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.AreaEntity;


public interface IAreaReadMapper {

	int count(Map<String, Object> params);

	List<AreaEntity> listAllArea(Map<String, Object> map);

	List<AreaEntity> listAreaByOrgStr(Map<String, Object> map);
	
	AreaEntity getAreaById(Long id);

}