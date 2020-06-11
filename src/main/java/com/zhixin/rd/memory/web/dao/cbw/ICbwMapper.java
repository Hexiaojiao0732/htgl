package com.zhixin.rd.memory.web.dao.cbw;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.CbwEntity;

public interface ICbwMapper {

	List<CbwEntity> queryAllCbw(Map<String, Object> map);

	int countCbw();

}
