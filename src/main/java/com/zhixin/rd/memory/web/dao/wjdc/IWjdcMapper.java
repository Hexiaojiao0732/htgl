package com.zhixin.rd.memory.web.dao.wjdc;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.WjdcEntity;

public interface IWjdcMapper {

	List<WjdcEntity> queryAllWjdc(Map<String, Object> map);

	int countWjdc();

	void deleteWjdcById(Long id);

	void updateWjdc(WjdcEntity entity);

	List<WjdcEntity> list(Map<String, Object> map);

}
