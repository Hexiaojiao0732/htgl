package com.zhixin.rd.memory.web.dao.zt;

import java.util.List;

import com.zhixin.rd.memory.web.entity.ZtEntity;

public interface IZtMapper {

	List<ZtEntity> queryAllZt();

	void insertZt(ZtEntity ztEntity);

	int countZt();

	List<ZtEntity> queryZtmc();

	void deleteZtById(Long id);

	List<ZtEntity> queryZtById(Long id);

	void updateZt(ZtEntity entity);

	void updateZtTp(ZtEntity entity);

}
