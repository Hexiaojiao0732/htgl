package com.zhixin.rd.memory.web.service.jl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.dmdz.IDmdzMapper;
import com.zhixin.rd.memory.web.dao.jl.IJlMapper;
import com.zhixin.rd.memory.web.entity.DmDzEntity;
import com.zhixin.rd.memory.web.entity.JlEntity;

import oracle.net.aso.i;
@Service
public class JlServiceImpl implements IJlService {
	@Autowired
	private IJlMapper jlMapper;
	@Autowired
	private IDmdzMapper iDmDzMapper;

	@Override
	public List<JlEntity> queryAlljl() {
		// TODO Auto-generated method stub
		return jlMapper.queryAlljl();
	}

	@Override
	public int countJl() {
		// TODO Auto-generated method stub
		return jlMapper.countJl();
	}

	@Override
	public void insertJl(JlEntity jlEntity) {
		// TODO Auto-generated method stub
		jlMapper.insertJl(jlEntity);
	}

	@Override
	public List<DmDzEntity> list(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return iDmDzMapper.list(params);
	}

	@Override
	public List<JlEntity> queryJlMc() {
		// TODO Auto-generated method stub
		return jlMapper.queryJlMc();
	}

	@Override
	public void deleteJlById(Long id) {
		// TODO Auto-generated method stub
		jlMapper.deleteJlById(id);
	}

	@Override
	public List<JlEntity> queryJlById(Long id) {
		// TODO Auto-generated method stub
		return jlMapper.queryJlById(id);
	}

	@Override
	public void updateJl(JlEntity entity) {
		// TODO Auto-generated method stub
		jlMapper.updateJl(entity);
	}

	@Override
	public void updateJlTp(JlEntity entity) {
		// TODO Auto-generated method stub
		jlMapper.updateJlTp(entity);
	}

}
