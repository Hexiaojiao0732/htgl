package com.zhixin.rd.memory.web.dao.zaiti;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.TkEntity;


public interface ITkMapper {

	List<TkEntity> queryTk(Map<String, Object> map);

	int countTk();

	void insertTy(TkEntity entity);

	void deleteTk(Long id);

	void updateTk(TkEntity entity);

	void insertTk(TkEntity entity);

	void updateShTk(Long id);

	void updateTkTp(TkEntity entity);


}
