package com.zhixin.rd.memory.web.dao.zx;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.ZxEntity;

public interface IZxMapper {

	void insertZx(ZxEntity entity);

	List<ZxEntity> queryAllZx();

	int countZx();

	List<ZxEntity> queryAllZxList(Map<String, Object> param);

	int countZxlist(Map<String, Object> param);

	void deleteZxById(Long id);

	void updateZx(ZxEntity entity);

	void updateZxTp(ZxEntity entity);

}
