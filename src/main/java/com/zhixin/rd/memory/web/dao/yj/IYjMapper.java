package com.zhixin.rd.memory.web.dao.yj;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.SyYjEntity;

public interface IYjMapper {

	List<SyYjEntity> queryYj(Map<String, Object> map);

	int countYj();

}
