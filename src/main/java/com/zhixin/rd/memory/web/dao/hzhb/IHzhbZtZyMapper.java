package com.zhixin.rd.memory.web.dao.hzhb;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.HzhbZtZyEntity;


public interface IHzhbZtZyMapper {

	List<HzhbZtZyEntity> queryAllHzhbZtZy(Map<String, Object> map);

	int countHzhbZtZy(Map<String, Object> map);

	void updateShZyById(HzhbZtZyEntity entity);

	void updateShZy(HzhbZtZyEntity entity);

	void deleteHzHbZtZy(Long id);


}
