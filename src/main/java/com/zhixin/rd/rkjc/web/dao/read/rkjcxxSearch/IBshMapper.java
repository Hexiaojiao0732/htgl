package com.zhixin.rd.rkjc.web.dao.read.rkjcxxSearch;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.BshEntity;

/**
 * Created by yangyk on 2017/07/18
 */
public interface IBshMapper {
    //根据证件号码查询全部
	public List<BshEntity> selectAll(String zjhm);
	//按时间前后查询
	public List<BshEntity> selectBshByTime(Map<String,Object> map);
	//按证件号码查询
	public List<BshEntity> selectBshByZjhm(String zjhm);
	//查询最新十条
	public List<BshEntity> selectBshByNew(String zjhm); 
}
