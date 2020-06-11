package com.zhixin.rd.memory.web.service.xm;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.XmEntity;
import com.zhixin.rd.memory.web.entity.XmSpEntity;
import com.zhixin.rd.memory.web.entity.XmTkEntity;

public interface IXmService {
	
	void insertXm(XmEntity entity);

	List<XmEntity> queryAllXm(Map<String, Object> map);

	int countXm(Map<String, Object> param);
	
	void insertXmSp(XmSpEntity entity);

	List<XmSpEntity> queryAllXmSp(Map<String, Object> map);

	int countXmSp(Map<String, Object> map);
	
	void insertXmTk(XmTkEntity entity);

	List<XmTkEntity> queryAllXmTk(Map<String, Object> map);

	int countXmTk(Map<String, Object> map);

	List<XmEntity> queryXmById(Long id);

	void updateXm(XmEntity entity);

	void updateXmSpById(XmSpEntity entity);

	void updateXmTkById(XmTkEntity entity);

	void deleteXm(Long id);

	void deleteXmSp(Long id);

	void deleteXmTk(Long id);

	List<XmEntity> queryTjXm();

	XmSpEntity getXmSpById(Long id);

	void updateXmDjlById(Map<String, Object> param);

	void updateXmImg(XmEntity entity);

	void updateXmSpImg(XmSpEntity entity);

	void updateXmTkImg(XmTkEntity entity);

}
