package com.zhixin.rd.memory.web.service.zx;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.zx.IZxMapper;
import com.zhixin.rd.memory.web.entity.ZxEntity;

@Service
public class ZxServiceImpl implements IZxService {
	@Autowired
	private IZxMapper zxMapper;

	@Override
	public void insertZx(ZxEntity entity) {
		// TODO Auto-generated method stub
		zxMapper.insertZx(entity);
	}

	@Override
	public List<ZxEntity> queryAllZx() {
		// TODO Auto-generated method stub
		return zxMapper.queryAllZx();
	}

	@Override
	public int countZx() {
		// TODO Auto-generated method stub
		return zxMapper.countZx();
	}

	@Override
	public List<ZxEntity> queryAllZxList(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return zxMapper.queryAllZxList(param);
	}

	@Override
	public int countZxlist(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return  zxMapper.countZxlist(param);
	}

	@Override
	public void deleteZxById(Long id) {
		// TODO Auto-generated method stub
		zxMapper.deleteZxById(id);
	}

	@Override
	public void updateZx(ZxEntity entity) {
		// TODO Auto-generated method stub
		zxMapper.updateZx(entity);
	}

	@Override
	public void updateZxTp(ZxEntity entity) {
		// TODO Auto-generated method stub
		zxMapper.updateZxTp(entity);
	}
}
