package com.zhixin.rd.memory.web.service.cbw;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.cbw.ICbwMapper;
import com.zhixin.rd.memory.web.entity.CbwEntity;
import com.zhixin.rd.memory.web.entity.DsjEntity;

@Service
public class CbwServiceImpl implements ICbwService {
	@Autowired
	private ICbwMapper cbwMapper;

	@Override
	public List<CbwEntity> queryAllCbw(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return cbwMapper.queryAllCbw(map);
	}

	@Override
	public int countCbw() {
		// TODO Auto-generated method stub
		return cbwMapper.countCbw();
	}
}
