package com.zhixin.rd.memory.web.service.dsj;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.dsj.IDsjMapper;
import com.zhixin.rd.memory.web.entity.DsjEntity;

@Service
public class DsjServiceImpl implements IDsjService {
	@Autowired
	private IDsjMapper dsjMapper;

	@Override
	public List<DsjEntity> queryAllDsj(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return dsjMapper.queryDsj(map);
	}

	@Override
	public int countDsj() {
		// TODO Auto-generated method stub
		return dsjMapper.countDsj();
	}

	@Override
	public void insertDsj(DsjEntity entity) {
		// TODO Auto-generated method stub
		dsjMapper.insertDsj(entity);
	}

	@Override
	public void updateDsj(DsjEntity entity) {
		// TODO Auto-generated method stub
		dsjMapper.updateDsj(entity);
	}

	@Override
	public void deleteDsjById(Long id) {
		// TODO Auto-generated method stub
		dsjMapper.deleteDsj(id);
	}

	@Override
	public void updateDsjTp(DsjEntity entity) {
		// TODO Auto-generated method stub
		dsjMapper.updateDsjTp(entity);
	}

}
