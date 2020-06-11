package com.zhixin.rd.memory.web.service.yj;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.yj.IYjMapper;
import com.zhixin.rd.memory.web.entity.SyYjEntity;

@Service
public class YjServiceImpl implements IYjService {
	@Autowired
	private IYjMapper yjMapper;

	@Override
	public List<SyYjEntity> queryAllYj(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return yjMapper.queryYj(map);
	}

	@Override
	public int countYj() {
		// TODO Auto-generated ()method stub
		return yjMapper.countYj();
	}
}
