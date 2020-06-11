package com.zhixin.rd.memory.web.dao.dsj;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.DsjEntity;

public interface IDsjMapper {

	List<DsjEntity> queryDsj(Map<String, Object> map);

	int countDsj();

	void insertDsj(DsjEntity entity);

	void updateDsj(DsjEntity entity);

	void deleteDsj(Long id);

	void updateDsjTp(DsjEntity entity);

}
