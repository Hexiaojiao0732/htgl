package com.zhixin.rd.rkjc.web.service.rkjcxxSearch;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.BshEntity;

/**
 * Created by yangyk on 2017/07/18
 */
public interface IBshService {
    //根据证件号码查询全部
	public List<BshEntity> queryAll(String zjhm);
	//按时间前后查询
	public Map<String,Object> queryBshByTime(String zjhm,String startTime,String endTime,Integer pageStart,Integer rows);
	//按证件号码查询
	public Map<String,Object> queryBshByZjhm(String zjhm,Integer pageStart,Integer rows);
	//查询最新十条
	public Map<String,Object> queryBshByNew(String zjhm,Integer count); 
}
