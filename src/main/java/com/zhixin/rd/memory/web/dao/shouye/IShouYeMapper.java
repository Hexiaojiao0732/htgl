package com.zhixin.rd.memory.web.dao.shouye;

import java.util.List;

import com.zhixin.rd.memory.web.entity.SySzEntity;

public interface IShouYeMapper {

	List<SySzEntity> queryList();

	void updateShouYe(SySzEntity entity);

	List<SySzEntity> querySpTj();

	void deleteSpTj(Long id);

	void insertSptj(SySzEntity entity);

	void zdSptj(SySzEntity entity);

	String queryBigBz();

}
