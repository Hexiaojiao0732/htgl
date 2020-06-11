package com.zhixin.rd.memory.web.service.jl;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.DmDzEntity;
import com.zhixin.rd.memory.web.entity.JlEntity;

public interface IJlService {

	List<JlEntity> queryAlljl();

	int countJl();

	void insertJl(JlEntity jlEntity);

	List<DmDzEntity> list(Map<String, Object> params);

	List<JlEntity> queryJlMc();

	void deleteJlById(Long id);

	List<JlEntity> queryJlById(Long id);

	void updateJl(JlEntity entity);

	void updateJlTp(JlEntity entity);


}
