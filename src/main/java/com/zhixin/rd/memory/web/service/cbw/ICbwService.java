package com.zhixin.rd.memory.web.service.cbw;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.CbwEntity;

public interface ICbwService {

	List<CbwEntity> queryAllCbw(Map<String, Object> map);

	int countCbw();

}
