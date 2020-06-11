package com.zhixin.rd.memory.web.dao.xm;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.XmEntity;

public interface IXmMapper {
	
	List<XmEntity> queryAllXm();
	
	int countXm(Map<String, Object> param);
	
	void insertXm(XmEntity entity);

	List<XmEntity> queryAllXmList(Map<String, Object> param);

	int countXmlist(Map<String, Object> param);

	void deleteXmById(Long id);

	void updateXm(XmEntity entity);
	
	List<XmEntity> queryAllXmById(Map<String, Object> param);

	List<XmEntity> queryTjXm();

	void updateXmDjlById(Map<String, Object> param);

	void updateXmImg(XmEntity entity);
}
