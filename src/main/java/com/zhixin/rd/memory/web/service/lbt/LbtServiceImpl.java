package com.zhixin.rd.memory.web.service.lbt;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.lbt.ILbtMapper;
import com.zhixin.rd.memory.web.entity.LbtEntity;

@Service
public class LbtServiceImpl implements ILbtService {
	@Autowired
	private ILbtMapper lbtMapper;

	@Override
	public List<LbtEntity> queryLbt(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return lbtMapper.queryLbt(map);
	}

	@Override
	public int countLbt(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return lbtMapper.countLbt(map);
	}

	@Override
	public void insertLbt(LbtEntity entity) {
		// TODO Auto-generated method stub
		lbtMapper.insertLbt(entity);
	}

	@Override
	public void deleteLbtById(Long id) {
		// TODO Auto-generated method stub
		lbtMapper.deleteLbtById(id);
	}

	@Override
	public void updateLbt(LbtEntity entity) {
		// TODO Auto-generated method stub
		lbtMapper.updateLbt(entity);
	}
}
