package com.zhixin.rd.rkjc.web.dao.read.personinfo;

import com.zhixin.rd.rkjc.web.entity.PersonInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 17-3-2.
 */
public interface IPersonInfoReadMapper {
    List<PersonInfoEntity> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    List<PersonInfoEntity> getPersonInfoById(int id);

    Map<String, Object> queryPersonRhAndSsssxqDmBySfzh(String sfzh);

}
