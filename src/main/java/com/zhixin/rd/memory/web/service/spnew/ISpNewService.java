package com.zhixin.rd.memory.web.service.spnew;

import java.util.List;
import java.util.Map;

public interface ISpNewService {

	List<Map<String, Object>> queryAllSp();

	Map<String, Object> queryAllSpById(Integer id);
}
