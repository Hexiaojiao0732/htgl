package com.zhixin.rd.memory.web.service.zaiti;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.TkEntity;


public interface ITkService {

	void updateTk(TkEntity entity);

	void deleteTkById(Long id);

	void insertTk(TkEntity entity);

	int countTk();

	List<TkEntity> queryAllTk(Map<String, Object> map);

	void updateTkById(Long id);

	void updateTkTp(TkEntity entity);


}
