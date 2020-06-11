package com.zhixin.rd.memory.web.dao.zaiti;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.WdEntity;


public interface IWdMapper {

	void deleteWd(Long id);

	void insertWd(WdEntity entity);

	List<WdEntity> queryAllWd(Map<String, Object> map);

	int countWd();

	void updateWd(WdEntity entity);

	void updateShWd(WdEntity entity);

	List<WdEntity> queryAllWd2(Map<String, Object> map);

	List<WdEntity> queryAllWd3(Map<String, Object> map);

	int countWd2();

	int countWd3();


}
