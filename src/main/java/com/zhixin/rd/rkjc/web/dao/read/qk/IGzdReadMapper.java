package com.zhixin.rd.rkjc.web.dao.read.qk;

import java.util.List;

import com.zhixin.rd.rkjc.web.entity.gzdEntity;

public interface IGzdReadMapper {
	public List<gzdEntity> getGzdListByXyrSfzh(String xyrSfzh)throws Exception; 
	public int GzdCountByXyrSfzh(String xyrSfzh)throws Exception; 

}
