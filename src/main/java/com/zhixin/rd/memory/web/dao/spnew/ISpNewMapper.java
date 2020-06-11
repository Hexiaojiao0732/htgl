package com.zhixin.rd.memory.web.dao.spnew;

import java.util.List;
import java.util.Map;

public interface ISpNewMapper {

	List<Map<String, Object>> queryAllSp();

	Map<String, Object> queryAllSpById(Integer id);
}
