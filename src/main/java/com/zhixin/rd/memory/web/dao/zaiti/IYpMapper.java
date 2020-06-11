package com.zhixin.rd.memory.web.dao.zaiti;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.SpEntity;
import com.zhixin.rd.memory.web.entity.YpEntity;

public interface IYpMapper {

	List<YpEntity> queryYp(Map<String, Object> map);

	int countYp();

	void insertYp(YpEntity entity);

	void deleteById(Long id);

	void updateYp(YpEntity entity);

	void updateShYp(YpEntity entity);

	List<YpEntity> queryAllYp2(Map<String, Object> map);

	int countYp2();

	List<YpEntity> queryAllYp3(Map<String, Object> map);

	int countYp3();


}
