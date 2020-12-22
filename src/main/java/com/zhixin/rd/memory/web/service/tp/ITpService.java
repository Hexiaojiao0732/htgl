package com.zhixin.rd.memory.web.service.tp;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.TpEntity;

public interface ITpService {

	void insertTp(TpEntity entity);

	List<TpEntity> queryTpList(Map<String, Object> param);

	int countTplist(Map<String, Object> param);

	void deleteTpById(Long id);

	void updateTp(TpEntity entity);

	List<Map<String, Object>> selectTpXm();
	
	List<Map<String, Object>> selectTpConfig();
	
	int updateTpConfig(String flag);
}
