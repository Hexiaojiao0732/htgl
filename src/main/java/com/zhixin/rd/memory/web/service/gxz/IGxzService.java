package com.zhixin.rd.memory.web.service.gxz;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.GxzEntity;


public interface IGxzService {


	int countGxz();

	void insertGxz(GxzEntity entity);

	void updateGxz(GxzEntity entity);

	void deleteGxzById(Long id);

	List<GxzEntity> queryAllGxz(Map<String, Object> param);

	List<GxzEntity> queryGxzMc();

	void updateGxzTp(GxzEntity entity);


}
