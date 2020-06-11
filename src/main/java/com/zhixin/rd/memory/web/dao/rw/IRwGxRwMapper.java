package com.zhixin.rd.memory.web.dao.rw;

import java.util.List;

import com.zhixin.rd.memory.web.entity.RwEntity;
import com.zhixin.rd.memory.web.entity.RwGxRwEntity;

public interface IRwGxRwMapper {

	void insertRwGxRw(RwGxRwEntity entity);

	List<RwGxRwEntity> queryRwById(Long Id);

	void deleteRwgxById(Long id);

}
