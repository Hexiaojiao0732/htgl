package com.zhixin.rd.memory.web.service.dsj;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.DsjEntity;

public interface IDsjService {


	int countDsj();

	void insertDsj(DsjEntity entity);

	void updateDsj(DsjEntity entity);

	void deleteDsjById(Long id);

	List<DsjEntity> queryAllDsj(Map<String, Object> param);

	void updateDsjTp(DsjEntity entity);

}
