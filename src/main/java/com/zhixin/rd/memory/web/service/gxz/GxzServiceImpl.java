package com.zhixin.rd.memory.web.service.gxz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.gxz.IGxzMapper;
import com.zhixin.rd.memory.web.entity.GxzEntity;

@Service
public class GxzServiceImpl implements IGxzService {
	@Autowired
	private IGxzMapper gxzMapper;

	@Override
	public List<GxzEntity> queryAllGxz(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return gxzMapper.queryGxz(map);
	}

	@Override
	public int countGxz() {
		// TODO Auto-generated method stub
		return gxzMapper.countGxz();
	}

	@Override
	public void insertGxz(GxzEntity entity) {
		// TODO Auto-generated method stub
		gxzMapper.insertGxz(entity);
	}

	@Override
	public void updateGxz(GxzEntity entity) {
		// TODO Auto-generated method stub
		gxzMapper.updateGxz(entity);
	}

	@Override
	public void deleteGxzById(Long id) {
		// TODO Auto-generated method stub
		gxzMapper.deleteGxz(id);
	}

	@Override
	public List<GxzEntity> queryGxzMc() {
		// TODO Auto-generated method stub
		return gxzMapper.queryGxzMc();
	}

	@Override
	public void updateGxzTp(GxzEntity entity) {
		// TODO Auto-generated method stub
		gxzMapper.updateGxzTp(entity);
	}

}
