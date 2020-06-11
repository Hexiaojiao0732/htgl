package com.zhixin.rd.memory.web.service.xm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.xm.IXmMapper;
import com.zhixin.rd.memory.web.dao.xm.IXmSpMapper;
import com.zhixin.rd.memory.web.dao.xm.IXmTkMapper;
import com.zhixin.rd.memory.web.entity.XmEntity;
import com.zhixin.rd.memory.web.entity.XmSpEntity;
import com.zhixin.rd.memory.web.entity.XmTkEntity;

@Service
public class XmServiceImpl implements IXmService{

	@Autowired
	IXmMapper xmMapper;
	
	@Autowired
	IXmSpMapper xmSpMapper;
	
	@Autowired
	IXmTkMapper xmTkMapper;
	
	@Override
	public void insertXm(XmEntity entity) {
		// TODO Auto-generated method stub
		xmMapper.insertXm(entity);
	}

	@Override
	public List<XmEntity> queryAllXm(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return xmMapper.queryAllXmList(param);
	}

	@Override
	public int countXm(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return xmMapper.countXm(param);
	}

	@Override
	public void insertXmSp(XmSpEntity entity) {
		// TODO Auto-generated method stub
		xmSpMapper.insertXmSp(entity);
	}

	@Override
	public List<XmSpEntity> queryAllXmSp(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return xmSpMapper.queryAllXmSpList(map);
	}

	@Override
	public int countXmSp(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return xmSpMapper.countXmSplist(map);
	}

	@Override
	public void insertXmTk(XmTkEntity entity) {
		// TODO Auto-generated method stub
		xmTkMapper.insertXmTk(entity);
	}

	@Override
	public List<XmTkEntity> queryAllXmTk(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return xmTkMapper.queryAllXmTkList(map);
	}

	@Override
	public int countXmTk(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return xmTkMapper.countXmTklist(map);
	}

	@Override
	public List<XmEntity> queryXmById(Long id) {
		// TODO Auto-generated method stub
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", id);
		return xmMapper.queryAllXmById(param);
	}

	@Override
	public void updateXm(XmEntity entity) {
		// TODO Auto-generated method stub
		xmMapper.updateXm(entity);
	}

	@Override
	public void updateXmSpById(XmSpEntity entity) {
		// TODO Auto-generated method stub
		xmSpMapper.updateXmSp(entity);
	}

	@Override
	public void updateXmTkById(XmTkEntity entity) {
		// TODO Auto-generated method stub
		xmTkMapper.updateXmTk(entity);
	}

	@Override
	public void deleteXm(Long id) {
		// TODO Auto-generated method stub
		xmMapper.deleteXmById(id);
	}

	@Override
	public void deleteXmSp(Long id) {
		// TODO Auto-generated method stub
		xmSpMapper.deleteXmSpById(id);
	}

	@Override
	public void deleteXmTk(Long id) {
		// TODO Auto-generated method stub
		xmTkMapper.deleteXmTkById(id);
	}

	@Override
	public List<XmEntity> queryTjXm() {
		return xmMapper.queryTjXm();
	}

	@Override
	public XmSpEntity getXmSpById(Long id) {
		return xmSpMapper.getXmSpById(id);
	}

	@Override
	public void updateXmDjlById(Map<String, Object> param) {
		xmMapper.updateXmDjlById(param);
	}

	@Override
	public void updateXmImg(XmEntity entity) {
		xmMapper.updateXmImg(entity);
	}

	@Override
	public void updateXmSpImg(XmSpEntity entity) {
		xmSpMapper.updateXmSpImg(entity);
	}

	@Override
	public void updateXmTkImg(XmTkEntity entity) {
		xmTkMapper.updateXmTkImg(entity);
	}

}
