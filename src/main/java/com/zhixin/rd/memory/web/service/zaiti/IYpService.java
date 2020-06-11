package com.zhixin.rd.memory.web.service.zaiti;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.YpEntity;

public interface IYpService {

	List<YpEntity> queryAllYp(Map<String, Object> map);

	int countYp();

	void insertYp(YpEntity entity);

	void updateYp(YpEntity entity);

	void deleteYpById(Long id);

	void updateShYp(YpEntity entity);

	List<YpEntity> queryAllYp2(Map<String, Object> map);

	int countYp2();

	List<YpEntity> queryAllYp3(Map<String, Object> map);

	int countYp3();


}
