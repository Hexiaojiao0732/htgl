package com.zhixin.rd.memory.web.service.zaiti;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.WdEntity;


public interface IWdService {

	void updateWd(WdEntity entity);

	void deleteWdById(Long id);

	void insertWd(WdEntity entity);

	List<WdEntity> queryAllWd(Map<String, Object> map);

	int countWd();

	void updateShWd(WdEntity entity);

	List<WdEntity> queryAllWd2(Map<String, Object> map);

	int countWd2();

	List<WdEntity> queryAllWd3(Map<String, Object> map);

	int countWd3();


}
