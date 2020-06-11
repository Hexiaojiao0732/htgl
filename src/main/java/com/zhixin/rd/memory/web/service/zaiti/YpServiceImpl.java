package com.zhixin.rd.memory.web.service.zaiti;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.zaiti.IYpMapper;
import com.zhixin.rd.memory.web.entity.YpEntity;


@Service
public class YpServiceImpl implements IYpService {
	@Autowired
	private IYpMapper ypMapper;

	@Override
	public List<YpEntity> queryAllYp(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return ypMapper.queryYp(map);
	}

	@Override
	public int countYp() {
		// TODO Auto-generated method stub
		return ypMapper.countYp();
	}

	@Override
	public void insertYp(YpEntity entity) {
		// TODO Auto-generated method stub
		ypMapper.insertYp(entity);
	}

	@Override
	public void deleteYpById(Long id) {
		// TODO Auto-generated method stub
		ypMapper.deleteById(id);
	}

	@Override
	public void updateYp(YpEntity entity) {
		// TODO Auto-generated method stub
		ypMapper.updateYp(entity);
	}

	@Override
	public void updateShYp(YpEntity entity) {
		// TODO Auto-generated method stub
		ypMapper.updateShYp(entity);
	}

	@Override
	public List<YpEntity> queryAllYp2(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return ypMapper.queryAllYp2(map);
	}

	@Override
	public int countYp2() {
		// TODO Auto-generated method stub
		return ypMapper.countYp2();
	}

	@Override
	public List<YpEntity> queryAllYp3(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return ypMapper.queryAllYp3(map);
	}

	@Override
	public int countYp3() {
		// TODO Auto-generated method stub
		return ypMapper.countYp3();
	}

}
