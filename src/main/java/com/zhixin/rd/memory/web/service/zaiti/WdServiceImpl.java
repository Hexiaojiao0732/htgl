package com.zhixin.rd.memory.web.service.zaiti;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.zaiti.IWdMapper;
import com.zhixin.rd.memory.web.entity.WdEntity;

@Service
public class WdServiceImpl implements IWdService {
	@Autowired
	private IWdMapper wdMapper;

	@Override
	public void updateWd(WdEntity entity) {
		// TODO Auto-generated method stub
		wdMapper.updateWd(entity);
	}

	@Override
	public void deleteWdById(Long id) {
		// TODO Auto-generated method stub
		wdMapper.deleteWd(id);
	}

	@Override
	public void insertWd(WdEntity entity) {
		// TODO Auto-generated method stub
		wdMapper.insertWd(entity);
	}

	@Override
	public List<WdEntity> queryAllWd(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return wdMapper.queryAllWd(map);
	}

	@Override
	public int countWd() {
		// TODO Auto-generated method stub
		return wdMapper.countWd();
	}

	@Override
	public void updateShWd(WdEntity entity) {
		// TODO Auto-generated method stub
		wdMapper.updateShWd(entity);
	}

	@Override
	public List<WdEntity> queryAllWd2(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return wdMapper.queryAllWd2(map);
	}

	@Override
	public int countWd2() {
		// TODO Auto-generated method stub
		return wdMapper.countWd2();
	}

	@Override
	public List<WdEntity> queryAllWd3(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return wdMapper.queryAllWd3(map);
	}

	@Override
	public int countWd3() {
		// TODO Auto-generated method stub
		return wdMapper.countWd3();
	}

}
