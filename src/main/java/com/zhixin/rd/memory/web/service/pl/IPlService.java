package com.zhixin.rd.memory.web.service.pl;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.PlEntity;
import com.zhixin.rd.memory.web.entity.TkEntity;

public interface IPlService {

	List<PlEntity> queryAllPl(Map<String, Object> map);

	int countPl(Map<String, Object> map);

	void deletePlById(Long id);

	void shPlById(Long id);

	void cancelShPlById(Long id);

}
