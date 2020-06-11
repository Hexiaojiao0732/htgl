package com.zhixin.rd.memory.web.service.ztmapinfo;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.ZtMapInfoEntity;

public interface IZtMapInfoService {

	List<ZtMapInfoEntity> selectAllList(Map<String, Object> map);

	int count(Map<String, Object> map);

	void insertZtMapInfo(ZtMapInfoEntity entity);

	void deleteZtMapInfo(Long id);

}
