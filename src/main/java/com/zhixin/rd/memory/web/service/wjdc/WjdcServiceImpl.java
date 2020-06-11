package com.zhixin.rd.memory.web.service.wjdc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.wjdc.IWjdcMapper;
import com.zhixin.rd.memory.web.entity.WjdcEntity;

@Service
public class WjdcServiceImpl implements IWjdcService {
	@Autowired
	private IWjdcMapper wjdcMapper;

	@Override
	public List<WjdcEntity> queryAllWjdc(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return wjdcMapper.queryAllWjdc(map);
	}

	@Override
	public int countWjdc() {
		// TODO Auto-generated method stub
		return wjdcMapper.countWjdc();
	}

	@Override
	public void deleteWjdcById(Long id) {
		// TODO Auto-generated method stub
		wjdcMapper.deleteWjdcById(id);
	}

	@Override
	public void updateWjdc(WjdcEntity entity) {
		// TODO Auto-generated method stub
		wjdcMapper.updateWjdc(entity);;
	}

	@Override
	public List<WjdcEntity> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return wjdcMapper.list(map);
	}
}
