package com.zhixin.rd.memory.web.service.ztmapinfo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.ztmapinfo.IZtMapInfoMapper;
import com.zhixin.rd.memory.web.entity.ZtMapInfoEntity;

@Service
public class ZtMapInfoServiceImpl implements IZtMapInfoService {
	@Autowired
	private IZtMapInfoMapper ztMapInfoMapper;

	@Override
	public List<ZtMapInfoEntity> selectAllList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return ztMapInfoMapper.selectAllList(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return ztMapInfoMapper.count(map);
	}

	@Override
	public void insertZtMapInfo(ZtMapInfoEntity entity) {
		// TODO Auto-generated method stub
		ztMapInfoMapper.insertZtMapInfo(entity);
	}

	@Override
	public void deleteZtMapInfo(Long id) {
		// TODO Auto-generated method stub
		ztMapInfoMapper.deleteZtMapInfo(id);
	}
}
