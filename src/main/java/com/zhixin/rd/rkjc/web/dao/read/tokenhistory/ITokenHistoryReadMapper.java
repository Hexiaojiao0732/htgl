package com.zhixin.rd.rkjc.web.dao.read.tokenhistory;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.TokenHistoryEntity;

public interface ITokenHistoryReadMapper {


	void insertHistory(TokenHistoryEntity tokenHistoryEntity);

	void updateTime();

	List<TokenHistoryEntity> queryAllToken(Integer id);

	TokenHistoryEntity queryByTokenAndIp(Map<String, Object> map);

}
