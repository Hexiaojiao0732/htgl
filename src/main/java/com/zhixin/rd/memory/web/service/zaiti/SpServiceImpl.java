package com.zhixin.rd.memory.web.service.zaiti;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.zaiti.ISpMapper;
import com.zhixin.rd.memory.web.entity.SpEntity;

@Service
public class SpServiceImpl implements ISpService {
	@Autowired
	private ISpMapper spMapper;

	@Override
	public List<SpEntity> queryAllSp(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return spMapper.querySp(map);
	}

	@Override
	public int countSp() {
		// TODO Auto-generated method stub
		return spMapper.countSp();
	}

	@Override
	public void insertSp(SpEntity entity) {
		// TODO Auto-generated method stub
		spMapper.insertSp(entity);
	}

	@Override
	public void updateSp(SpEntity entity) {
		// TODO Auto-generated method stub
		spMapper.updateSp(entity);
	}

	@Override
	public void deleteSpById(Long id) {
		// TODO Auto-generated method stub
		spMapper.deleteSpById(id);
	}

	@Override
	public void updateShSp(SpEntity entity) {
		// TODO Auto-generated method stub
		spMapper.updateShSp(entity);
	}

	@Override
	public List<SpEntity> queryAllSp2(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return spMapper.queryAllSp2(map);
	}

	@Override
	public int countSp2() {
		// TODO Auto-generated method stub
		return spMapper.countSp2();
	}

	@Override
	public List<SpEntity> queryAllSp3(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return spMapper.queryAllSp3(map);
	}

	@Override
	public int countSp3() {
		// TODO Auto-generated method stub
		return spMapper.countSp3();
	}

	@Override
	public void updateSpTp(SpEntity entity) {
		// TODO Auto-generated method stub
		spMapper.updateSpTp(entity);
	}

	@Override
	public List<SpEntity> querySpList() {
		// TODO Auto-generated method stub
		return spMapper.querySpList();
	}
}
