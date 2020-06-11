package com.zhixin.rd.memory.web.dao.jl;

import java.util.List;

import com.zhixin.rd.memory.web.entity.JlEntity;

public interface IJlMapper {


	List<JlEntity> queryAlljl();

	int countJl();

	void insertJl(JlEntity jlEntity);

	List<JlEntity> queryJlMc();

	void deleteJlById(Long id);

	List<JlEntity> queryJlById(Long id);

	void updateJl(JlEntity entity);

	void updateJlTp(JlEntity entity);

}
