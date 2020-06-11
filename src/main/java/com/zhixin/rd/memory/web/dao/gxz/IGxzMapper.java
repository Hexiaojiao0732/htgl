package com.zhixin.rd.memory.web.dao.gxz;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.GxzEntity;

public interface IGxzMapper {

	List<GxzEntity> queryGxz(Map<String, Object> map);

	int countGxz();

	void insertGxz(GxzEntity entity);

	void updateGxz(GxzEntity entity);

	void deleteGxz(Long id);

	List<GxzEntity> queryGxzMc();

	void updateGxzTp(GxzEntity entity);

}
