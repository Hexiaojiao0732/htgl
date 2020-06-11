package com.zhixin.rd.memory.web.service.rw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.memory.web.dao.rw.IRwGxRwMapper;
import com.zhixin.rd.memory.web.dao.rw.IRwMapper;
import com.zhixin.rd.memory.web.entity.RwEntity;
import com.zhixin.rd.memory.web.entity.RwGxRwEntity;

@Service
public class RwServiceImpl implements IRwService {
@Autowired
private IRwMapper  rwMapper;
@Autowired
private IRwGxRwMapper rwGxMapper;

@Override
public void insertRw(RwEntity entity) {
	// TODO Auto-generated method stub
	rwMapper.insertRw(entity);
}

@Override
public void insertRwGx(RwGxRwEntity entity) {
	// TODO Auto-generated method stub
	rwGxMapper.insertRwGxRw(entity);
}

@Override
public List<RwEntity> queryAllRw() {
	// TODO Auto-generated method stub
	return rwMapper.queryAllRw();
}

@Override
public int countRw() {
	// TODO Auto-generated method stub
	return rwMapper.countRw();
}

@Override
public List<RwGxRwEntity> queryRwById(Long Id) {
	// TODO Auto-generated method stub
	return rwGxMapper.queryRwById(Id);
}

@Override
public List<RwEntity> queryRwMc() {
	// TODO Auto-generated method stub
	return rwMapper.queryRwMc();
}

@Override
public void deleteRwById(Long id) {
	// TODO Auto-generated method stub
	rwMapper.deleteRwById(id);
}

@Override
public List<RwEntity> queryById(Long id) {
	// TODO Auto-generated method stub
	return rwMapper.queryById(id);
}

@Override
public void updateRw(RwEntity entity) {
	// TODO Auto-generated method stub
	rwMapper.updateRw(entity);
}

@Override
public void updateRwTp(RwEntity entity) {
	// TODO Auto-generated method stub
	rwMapper.updateRwTp(entity);
}

@Override
public void deleteRwgxById(Long id) {
	// TODO Auto-generated method stub
	rwGxMapper.deleteRwgxById(id);
}

}
