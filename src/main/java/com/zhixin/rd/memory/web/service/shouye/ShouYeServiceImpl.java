package com.zhixin.rd.memory.web.service.shouye;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.shouye.IShouYeMapper;
import com.zhixin.rd.memory.web.entity.SySzEntity;

@Service
public class ShouYeServiceImpl implements IShouYeService {
	@Autowired
	private IShouYeMapper shouYeMapper;

	@Override
	public List<SySzEntity> queryList() {
		// TODO Auto-generated method stub
		return shouYeMapper.queryList();
	}

	@Override
	public void updateShouYe(SySzEntity entity) {
		// TODO Auto-generated method stub
		shouYeMapper.updateShouYe(entity);
	}

	@Override
	public List<SySzEntity> querySpTj() {
		// TODO Auto-generated method stub
		return shouYeMapper.querySpTj();
	}

	@Override
	public void deleteSpTj(Long id) {
		// TODO Auto-generated method stub
		shouYeMapper.deleteSpTj(id);
	}

	@Override
	public void insertSptj(SySzEntity entity) {
		// TODO Auto-generated method stub
		shouYeMapper.insertSptj(entity);
	}

	@Override
	public void zdSpTj(SySzEntity entity) {
		// TODO Auto-generated method stub
		shouYeMapper.zdSptj(entity);
	}

	@Override
	public String queryBigBz() {
		// TODO Auto-generated method stub
		return shouYeMapper.queryBigBz();
	}
}
