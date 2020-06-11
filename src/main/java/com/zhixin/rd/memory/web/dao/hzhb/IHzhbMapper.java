package com.zhixin.rd.memory.web.dao.hzhb;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.HzhbEntity;


public interface IHzhbMapper {

	void insertHzhb(HzhbEntity entity);

	List<HzhbEntity> queryHzhb();

	int countHzhb();

	void deleteHzhbById(Long id);

	List<HzhbEntity> queryHzhbById(Long id);

	void updateHzhb(HzhbEntity entity);

	void updateHzhbTp(HzhbEntity entity);


}
