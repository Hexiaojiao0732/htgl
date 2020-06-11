package com.zhixin.rd.memory.web.dao.hzhb;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.HzhbZtEntity;


public interface IHzhbZtMapper {

	List<HzhbZtEntity> queryAllHzhbZt(Map<String, Object> map);

	int countHzhbZt(Map<String, Object> map);

	void updateShZtById(HzhbZtEntity entity);

	void deleteHzHbZt(Long id);


}
