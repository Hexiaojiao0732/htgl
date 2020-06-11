package com.zhixin.rd.memory.web.service.zt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.zt.IZtMapper;
import com.zhixin.rd.memory.web.entity.ZtEntity;
@Service
public class ZtServiceImpl implements IZtService {
	@Autowired
	private IZtMapper ztMapper;

	@Override
	public List<ZtEntity> queryAllZt() {
		// TODO Auto-generated method stub
		return ztMapper.queryAllZt();
	}

	@Override
	public void insertZt(ZtEntity ztEntity) {
		// TODO Auto-generated method stub
		ztMapper.insertZt(ztEntity);
	}

	@Override
	public int countZt() {
		// TODO Auto-generated method stub
		return ztMapper.countZt();
	}

	@Override
	public List<ZtEntity> queryZtMc() {
		// TODO Auto-generated method stub
		return ztMapper.queryZtmc();
	}

	@Override
	public void deleteZtById(Long id) {
		// TODO Auto-generated method stub
		ztMapper.deleteZtById(id);
	}

	@Override
	public List<ZtEntity> queryZtById(Long id) {
		// TODO Auto-generated method stub
		return ztMapper.queryZtById(id);
	}

	@Override
	public void updateZt(ZtEntity entity) {
		// TODO Auto-generated method stub
		ztMapper.updateZt(entity);
	}

	@Override
	public void updateZtTp(ZtEntity entity) {
		// TODO Auto-generated method stub
		ztMapper.updateZtTp(entity);
	}

}
