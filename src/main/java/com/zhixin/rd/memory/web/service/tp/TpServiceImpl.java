package com.zhixin.rd.memory.web.service.tp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.tp.ITpMapper;
import com.zhixin.rd.memory.web.entity.TpEntity;

@Service
public class TpServiceImpl implements ITpService{
	
	@Autowired
	private ITpMapper tpMapper;
	
	@Override
	public void insertTp(TpEntity entity) {
		// TODO Auto-generated method stub
		tpMapper.insertTp(entity);
	}

	@Override
	public List<TpEntity> queryTpList(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return tpMapper.queryTpList(param);
	}

	@Override
	public int countTplist(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return  tpMapper.countTplist(param);
	}

	@Override
	public void deleteTpById(Long id) {
		// TODO Auto-generated method stub
		tpMapper.deleteTpById(id);
	}

	@Override
	public void updateTp(TpEntity entity) {
		// TODO Auto-generated method stub
		tpMapper.updateTp(entity);
	}

	@Override
	public List<Map<String, Object>> selectTpXm() {
		// TODO Auto-generated method stub
		return tpMapper.selectTpXm();
	}

	@Override
	public List<Map<String, Object>> selectTpConfig() {
		// TODO Auto-generated method stub
		return tpMapper.selectTpConfig();
	}

	@Override
	public int updateTpConfig(String flag) {
		// TODO Auto-generated method stub
		return tpMapper.updateTpConfig(flag);
	}

}
