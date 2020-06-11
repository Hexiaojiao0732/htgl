package com.zhixin.rd.rkjc.web.dao.read.rkjcxxSearch;

import com.zhixin.rd.rkjc.web.entity.CodeEntity;
import com.zhixin.rd.rkjc.web.entity.QkryajEntity;
import com.zhixin.rd.rkjc.web.entity.RkjcxxEntity;
import com.zhixin.rd.rkjc.web.form.YasrForm;

import java.util.List;
import java.util.Map;


public interface IRkjcxxMapper {

	List<RkjcxxEntity> queryRkjcxxByZjhm(String zjhm);


	//以案搜人
	 RkjcxxEntity queryRkjcxxByYasr(QkryajEntity qkryajEntity);

	//以案搜人查询数量
	int queryRkjcxxCountByYasr(YasrForm form);
	//因为i身份证号为空所以查询所有

	List<RkjcxxEntity> queryAlljcxxByYasr();




	List<CodeEntity> rkJcxxStatistics();
	//统计总人数
	public Long rkJcxxStatisticsByZs();
	//统计非河南
	public Long rkJcxxStatisticsByFhn();
	//统计昨日新增
	public Long rkJcxxStatisticsByZrxz();

	//通过身份证号补全基本信息
	RkjcxxEntity queryJcxxBySfzh(QkryajEntity qkryajEntity);
}
