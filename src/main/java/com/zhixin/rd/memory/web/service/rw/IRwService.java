package com.zhixin.rd.memory.web.service.rw;

import java.util.List;

import com.zhixin.rd.memory.web.entity.RwEntity;
import com.zhixin.rd.memory.web.entity.RwGxRwEntity;

public interface IRwService {

	void insertRw(RwEntity entity);

	void insertRwGx(RwGxRwEntity entity);

	List<RwEntity> queryAllRw();

	int countRw();

	List<RwGxRwEntity> queryRwById(Long id);

	List<RwEntity> queryRwMc();

	void deleteRwById(Long id);

	List<RwEntity> queryById(Long id);

	void updateRw(RwEntity entity);

	void updateRwTp(RwEntity entity);
	
	void deleteRwgxById(Long id);

}
