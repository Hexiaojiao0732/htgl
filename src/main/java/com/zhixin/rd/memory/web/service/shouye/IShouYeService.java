package com.zhixin.rd.memory.web.service.shouye;

import java.util.List;

import com.zhixin.rd.memory.web.entity.SySzEntity;

public interface IShouYeService {

	List<SySzEntity> queryList();

	void updateShouYe(SySzEntity entity);

	List<SySzEntity> querySpTj();

	void deleteSpTj(Long id);

	void insertSptj(SySzEntity entity);

	void zdSpTj(SySzEntity entity);

	String queryBigBz();

}
