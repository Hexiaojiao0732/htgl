package com.zhixin.rd.rkjc.web.service.rkjcxxSearch;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.SfxxEntity;

/**
 * Created by yangyk on 2017/07/18
 */
public interface ISfxxService {
    //根据证件号码查询全部
	public List<SfxxEntity> queryAll(String zjhm);
	//根据证件号码和来源查询
	public Map<String,Object> queryAllByLy(String zjhm,String ly,Integer pageStart,Integer rows);
}
