package com.zhixin.rd.memory.web.service.hzhb;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.hzhb.IHzhbMapper;
import com.zhixin.rd.memory.web.dao.hzhb.IHzhbZtMapper;
import com.zhixin.rd.memory.web.dao.hzhb.IHzhbZtZyMapper;
import com.zhixin.rd.memory.web.entity.HzhbEntity;
import com.zhixin.rd.memory.web.entity.HzhbZtEntity;
import com.zhixin.rd.memory.web.entity.HzhbZtZyEntity;

@Service
public class HzhbServiceImpl implements IHzhbService {
	@Autowired
	private IHzhbMapper hzhbMapper;
	@Autowired
	private IHzhbZtMapper hzhbZtMapper;
	@Autowired
	private IHzhbZtZyMapper hzhbZtZyMapper;

	@Override
	public void insertHzhb(HzhbEntity entity) {
		// TODO Auto-generated method stub
		hzhbMapper.insertHzhb(entity);
	}

	@Override
	public List<HzhbEntity> queryAllHzhb() {
		// TODO Auto-generated method stub
		return hzhbMapper.queryHzhb();
	}

	@Override
	public int countHzhb() {
		// TODO Auto-generated method stub
		return hzhbMapper.countHzhb();
	}

	@Override
	public List<HzhbZtEntity> queryAllHzhbZt(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hzhbZtMapper.queryAllHzhbZt(map);
	}

	@Override
	public int countHzhbZt(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hzhbZtMapper.countHzhbZt(map);
	}

	@Override
	public List<HzhbZtZyEntity> queryAllHzhbZtZy(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hzhbZtZyMapper.queryAllHzhbZtZy(map);
	}

	@Override
	public int countHzhbZtZy(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hzhbZtZyMapper.countHzhbZtZy(map);
	}

	@Override
	public void deleteHzhbById(Long id) {
		// TODO Auto-generated method stub
		hzhbMapper.deleteHzhbById(id);
	}

	@Override
	public List<HzhbEntity> queryHzhbById(Long id) {
		// TODO Auto-generated method stub
		return hzhbMapper.queryHzhbById(id);
	}

	@Override
	public void updateHzhb(HzhbEntity entity) {
		// TODO Auto-generated method stub
		hzhbMapper.updateHzhb(entity);
	}

	@Override
	public void updateShZtById(HzhbZtEntity entity) {
		// TODO Auto-generated method stub
		hzhbZtMapper.updateShZtById(entity);
	}

	@Override
	public void updateShZyById(HzhbZtZyEntity entity) {
		// TODO Auto-generated method stub
		hzhbZtZyMapper.updateShZyById(entity);
	}

	@Override
	public void updateShZy(HzhbZtZyEntity entity) {
		// TODO Auto-generated method stub
		hzhbZtZyMapper.updateShZy(entity);
	}

	@Override
	public void deleteHzHbZt(Long id) {
		// TODO Auto-generated method stub
		hzhbZtMapper.deleteHzHbZt(id);
	}

	@Override
	public void deleteHzHbZtZy(Long id) {
		// TODO Auto-generated method stub
		hzhbZtZyMapper.deleteHzHbZtZy(id);
	}

	@Override
	public void updateHzhbTp(HzhbEntity entity) {
		// TODO Auto-generated method stub
		hzhbMapper.updateHzhbTp(entity);
	}

}
