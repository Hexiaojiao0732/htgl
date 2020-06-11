package com.zhixin.rd.memory.web.dao.pl;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.PlEntity;

public interface IPlMapper {

	int countPl(Map<String, Object> map);

	List<PlEntity> queryAllPl(Map<String, Object> map);

	void deletePlById(Long id);

	void shPlById(Long id);

	void cancelShPlById(Long id);

}
