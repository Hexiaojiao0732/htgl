package com.zhixin.rd.memory.web.service.zt;

import java.util.List;

import com.zhixin.rd.memory.web.entity.ZtEntity;

public interface IZtService {

	List<ZtEntity> queryAllZt();

	void insertZt(ZtEntity ztEntity);

	int countZt();
	
	List<ZtEntity> queryZtMc();

	void deleteZtById(Long id);

	List<ZtEntity> queryZtById(Long id);

	void updateZt(ZtEntity entity);

	void updateZtTp(ZtEntity entity);

}
