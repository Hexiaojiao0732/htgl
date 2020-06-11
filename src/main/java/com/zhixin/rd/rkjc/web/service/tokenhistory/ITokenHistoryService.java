package com.zhixin.rd.rkjc.web.service.tokenhistory;

import java.util.List;

import com.zhixin.rd.rkjc.web.entity.TokenHistoryEntity;

public interface ITokenHistoryService {


	void insertHistory(TokenHistoryEntity tokenHistoryEntity);

	void updateTime();

	List<TokenHistoryEntity> queryAllToken(Integer id);

	TokenHistoryEntity queryByTokenAndIp(String token,String ip);
}
