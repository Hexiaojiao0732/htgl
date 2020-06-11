package com.zhixin.rd.rkjc.web.dao.read.wffzqk;

import com.zhixin.rd.rkjc.web.entity.PoliceQueryLogsEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by 19703 on 2017/6/19.
 */
public interface IPoliceQueryLogsMapper {
    List<PoliceQueryLogsEntity> list(Map<String, Object> map);

    int count(Map<String, Object> map);
}
