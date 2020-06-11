package com.zhixin.rd.rkjc.web.dao.read.application;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhixin.rd.rkjc.web.entity.InterfaceApplicationDetailEntity;
import com.zhixin.rd.rkjc.web.entity.InterfaceApplicationEntity;

/**
 * reated by yangyk on 2017/3/2. 申请详细信息
 */
public interface IInterfaceApplicationReadMapper {

	// 查询全部申请信息
	public List<InterfaceApplicationEntity> selectAll();

	// 查询中甲表
	public List<InterfaceApplicationDetailEntity> selectAllByApplicationId(Integer applicationId);

	List<InterfaceApplicationEntity> getAllApplication(Map<String, Object> map);

	public InterfaceApplicationEntity queryById(Integer id);

	public InterfaceApplicationEntity selectApplicationByTokenId(String tokenValue);

	public int queryCount();

	public List<InterfaceApplicationEntity> searchAll(Map<String, Object> map);

	public int searchCount(Map<String, Object> map);
}
