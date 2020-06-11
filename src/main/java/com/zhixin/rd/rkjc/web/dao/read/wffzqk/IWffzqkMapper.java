package com.zhixin.rd.rkjc.web.dao.read.wffzqk;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zhixin.rd.rkjc.web.entity.QkryajEntity;
import com.zhixin.rd.rkjc.web.form.WffzqkForm;
@Repository
public interface IWffzqkMapper {

	List<QkryajEntity> query(Map<String, Object> map);

	QkryajEntity queryPlcx(QkryajEntity qkryajEntity);
	List<QkryajEntity> plcxCount(Map<String, Object> map);
	List<QkryajEntity> queryAllByTableName(WffzqkForm form);
	Long queryAllByTableNameCount(WffzqkForm form);
	List<QkryajEntity> queryAllByTableNamePtcx(WffzqkForm form);
}
