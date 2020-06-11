package com.zhixin.rd.memory.web.service.yj;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.SyYjEntity;

public interface IYjService {

	List<SyYjEntity> queryAllYj(Map<String, Object> map);

	int countYj();

}
