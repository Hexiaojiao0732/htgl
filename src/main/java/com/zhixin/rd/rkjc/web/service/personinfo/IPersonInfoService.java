package com.zhixin.rd.rkjc.web.service.personinfo;

import com.zhixin.rd.rkjc.web.entity.PersonInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 17-3-2.
 */
public interface IPersonInfoService {
    List<PersonInfoEntity> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    List<PersonInfoEntity> getPersonInfoById(int id);

    Map<String, Object> queryPersonRhAndSsssxqDmBySfzh(String sfzh);
}
