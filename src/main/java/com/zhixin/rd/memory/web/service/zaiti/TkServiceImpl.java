package com.zhixin.rd.memory.web.service.zaiti;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.zaiti.ITkMapper;
import com.zhixin.rd.memory.web.entity.TkEntity;

@Service
public class TkServiceImpl implements ITkService {
	@Autowired
	private ITkMapper tkMapper;

	@Override
	public void updateTk(TkEntity entity) {
		// TODO Auto-generated method stub
		tkMapper.updateTk(entity);
	}

	@Override
	public void deleteTkById(Long id) {
		// TODO Auto-generated method stub
		tkMapper.deleteTk(id);
	}

	@Override
	public void insertTk(TkEntity entity) {
		// TODO Auto-generated method stub
		tkMapper.insertTk(entity);
	}

	@Override
	public int countTk() {
		// TODO Auto-generated method stub
		return tkMapper.countTk();
	}

	@Override
	public List<TkEntity> queryAllTk(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tkMapper.queryTk(map);
	}

	@Override
	public void updateTkById(Long id) {
		// TODO Auto-generated method stub
		tkMapper.updateShTk(id);
	}

	@Override
	public void updateTkTp(TkEntity entity) {
		// TODO Auto-generated method stub
		tkMapper.updateTkTp(entity);
	}

}
