package com.zhixin.rd.memory.web.dao.rw;

import java.util.List;

import com.zhixin.rd.memory.web.entity.RwEntity;

public interface IRwMapper {

	void insertRw(RwEntity entity);

	List<RwEntity> queryAllRw();

	int countRw();

	List<RwEntity> queryRwMc();

	void deleteRwById(Long id);

	List<RwEntity> queryById(Long id);

	void updateRw(RwEntity entity);

	void updateRwTp(RwEntity entity);

}
