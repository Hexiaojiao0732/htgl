package com.zhixin.rd.rkjc.web.dao.read.rkjcxxSearch;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.GjEntity;

/**
 * Created by yangyk on 2017/07/18
 */
public interface IGjMapper {
    //根据证件号码查询全部
	public List<GjEntity> selectAll(String zjhm);
	//按时间前后查询
	public List<GjEntity> selectGjByTime(Map<String,Object> map);
	//按证件号码查询
	public List<GjEntity> selectGjByZjhm(String zjhm);
	//查询最新十条
	public List<GjEntity> selectgjByNew(String zjhm); 
}
