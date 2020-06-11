package com.zhixin.rd.memory.web.service.pl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.pl.IPlMapper;
import com.zhixin.rd.memory.web.entity.PlEntity;

@Service
public class PlServiceImpl implements IPlService {
	@Autowired
	private IPlMapper plMapper;

	@Override
	public List<PlEntity> queryAllPl(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return plMapper.queryAllPl(map);
	}

	@Override
	public int countPl(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return plMapper.countPl(map);
	}

	@Override
	public void deletePlById(Long id) {
		// TODO Auto-generated method stub
		plMapper.deletePlById(id);
	}

	@Override
	public void shPlById(Long id) {
		// TODO Auto-generated method stub
		plMapper.shPlById(id);
	}

	@Override
	public void cancelShPlById(Long id) {
		// TODO Auto-generated method stub
		plMapper.cancelShPlById(id);
	}
}
