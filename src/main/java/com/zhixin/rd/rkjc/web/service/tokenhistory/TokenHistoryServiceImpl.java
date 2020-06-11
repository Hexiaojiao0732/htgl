package com.zhixin.rd.rkjc.web.service.tokenhistory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.rkjc.web.dao.read.tokenhistory.ITokenHistoryReadMapper;
import com.zhixin.rd.rkjc.web.entity.TokenHistoryEntity;

@Service
public class TokenHistoryServiceImpl implements ITokenHistoryService {
	@Autowired
	private ITokenHistoryReadMapper iTokenHistoryMapper;

	@Override
	public void insertHistory(TokenHistoryEntity tokenHistoryEntity) {
		iTokenHistoryMapper.insertHistory(tokenHistoryEntity);

	}

	@Override
	public void updateTime() {
		iTokenHistoryMapper.updateTime();

	}

	@Override
	public List<TokenHistoryEntity> queryAllToken(Integer id) {
		List<TokenHistoryEntity> list = iTokenHistoryMapper.queryAllToken(id);
		return list;

	}

	@Override
	public TokenHistoryEntity queryByTokenAndIp(String token, String ip) {
		Map<String,Object> map=new HashMap<>();
		map.put("token",token);
		map.put("ip",ip);
		return iTokenHistoryMapper.queryByTokenAndIp(map);
	}
}
