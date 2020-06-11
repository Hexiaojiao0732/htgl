package com.zhixin.rd.memory.web.service.hzhb;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.GxzEntity;
import com.zhixin.rd.memory.web.entity.HzhbEntity;
import com.zhixin.rd.memory.web.entity.HzhbZtEntity;
import com.zhixin.rd.memory.web.entity.HzhbZtZyEntity;

public interface IHzhbService {

	void insertHzhb(HzhbEntity entity);

	List<HzhbEntity> queryAllHzhb();

	int countHzhb();

	List<HzhbZtEntity> queryAllHzhbZt(Map<String, Object> map);

	int countHzhbZt(Map<String, Object> map);

	List<HzhbZtZyEntity> queryAllHzhbZtZy(Map<String, Object> map);

	int countHzhbZtZy(Map<String, Object> map);

	void deleteHzhbById(Long id);

	List<HzhbEntity> queryHzhbById(Long id);

	void updateHzhb(HzhbEntity entity);

	void updateShZtById(HzhbZtEntity entity);

	void updateShZyById(HzhbZtZyEntity entity);

	void updateShZy(HzhbZtZyEntity entity);

	void deleteHzHbZt(Long id);

	void deleteHzHbZtZy(Long id);

	void updateHzhbTp(HzhbEntity entity);

}
