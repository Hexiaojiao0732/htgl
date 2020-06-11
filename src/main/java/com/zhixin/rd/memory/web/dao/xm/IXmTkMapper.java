package com.zhixin.rd.memory.web.dao.xm;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.XmTkEntity;

public interface IXmTkMapper {
	
	List<XmTkEntity> queryAllXmTk();
	
	int countXmTk();
	
	void insertXmTk(XmTkEntity entity);

	List<XmTkEntity> queryAllXmTkList(Map<String, Object> param);

	int countXmTklist(Map<String, Object> param);

	void deleteXmTkById(Long id);

	void updateXmTk(XmTkEntity entity);

	void updateXmTkImg(XmTkEntity entity);

}
