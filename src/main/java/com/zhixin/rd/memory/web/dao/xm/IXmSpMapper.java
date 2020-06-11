package com.zhixin.rd.memory.web.dao.xm;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.XmEntity;
import com.zhixin.rd.memory.web.entity.XmSpEntity;

public interface IXmSpMapper {
	
	List<XmSpEntity> queryAllXmSp();
	
	int countXmSp();
	
	void insertXmSp(XmSpEntity entity);

	List<XmSpEntity> queryAllXmSpList(Map<String, Object> param);

	int countXmSplist(Map<String, Object> param);

	void deleteXmSpById(Long id);

	void updateXmSp(XmSpEntity entity);

	XmSpEntity getXmSpById(Long id);

	void updateXmSpImg(XmSpEntity entity);
}
