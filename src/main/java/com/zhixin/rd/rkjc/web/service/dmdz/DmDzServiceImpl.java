package com.zhixin.rd.rkjc.web.service.dmdz;

import com.zhixin.rd.rkjc.web.dao.read.dmdz.IDmDzMapper;
import com.zhixin.rd.rkjc.web.entity.DmDzEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DmDzServiceImpl implements IDmDzService {

	@Autowired
	private IDmDzMapper mapper;

	
	/**
	 * @param level 1省 2城市 3区县 4街道镇;
	 *  
	 * @param parentId
	 */
	@Override
	public List<DmDzEntity> list(Map<String, Object> map) {
		return mapper.list(map);
	}

}