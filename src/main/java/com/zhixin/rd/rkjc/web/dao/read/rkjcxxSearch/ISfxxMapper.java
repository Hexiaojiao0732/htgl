package com.zhixin.rd.rkjc.web.dao.read.rkjcxxSearch;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.SfxxEntity;

/**
 * Created by yangyk on 2017/07/18
 */
public interface ISfxxMapper {
    //根据证件号码查询全部
	public List<SfxxEntity> selectAll(String zjhm);
	//根据证件号码和来源查询
	public List<SfxxEntity> selectAllByLy(Map<String,Object> map);
}