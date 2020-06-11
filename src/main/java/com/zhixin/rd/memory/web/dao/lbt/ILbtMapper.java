package com.zhixin.rd.memory.web.dao.lbt;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.LbtEntity;

public interface ILbtMapper {

	List<LbtEntity> queryLbt(Map<String, Object> map);

	int countLbt(Map<String, Object> map);

	void insertLbt(LbtEntity entity);

	void deleteLbtById(Long id);

	void updateLbt(LbtEntity entity);

}
