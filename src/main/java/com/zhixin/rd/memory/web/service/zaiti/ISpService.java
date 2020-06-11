package com.zhixin.rd.memory.web.service.zaiti;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.SpEntity;

public interface ISpService {

	List<SpEntity> queryAllSp(Map<String, Object> map);

	int countSp();

	void insertSp(SpEntity entity);

	void updateSp(SpEntity entity);

	void deleteSpById(Long id);

	void updateShSp(SpEntity entity);

	List<SpEntity> queryAllSp2(Map<String, Object> map);

	int countSp2();

	List<SpEntity> queryAllSp3(Map<String, Object> map);

	int countSp3();

	void updateSpTp(SpEntity entity);

	List<SpEntity> querySpList();

}
