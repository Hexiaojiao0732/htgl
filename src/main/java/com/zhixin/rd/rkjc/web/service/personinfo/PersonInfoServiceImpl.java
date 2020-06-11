package com.zhixin.rd.rkjc.web.service.personinfo;

import com.zhixin.rd.rkjc.web.dao.read.personinfo.IPersonInfoReadMapper;
import com.zhixin.rd.rkjc.web.entity.PersonInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonInfoServiceImpl implements IPersonInfoService {

	@Autowired
	private IPersonInfoReadMapper personInfoMapper;

    @Override
    public List<PersonInfoEntity> list(Map<String, Object> map) {
        return personInfoMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return personInfoMapper.count(map);
    }

    @Override
    public List<PersonInfoEntity> getPersonInfoById(int id) {
        return personInfoMapper.getPersonInfoById(id);
    }

    @Override
    public Map<String, Object> queryPersonRhAndSsssxqDmBySfzh(String sfzh) {
        return personInfoMapper.queryPersonRhAndSsssxqDmBySfzh(sfzh);
    }

}
