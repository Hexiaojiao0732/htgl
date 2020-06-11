package com.zhixin.rd.rkjc.web.dao.read.echarts;

import java.util.List;
import java.util.Map;

/**
 * Created by 19703 on 2017/3/16.
 */
public interface IEchartsReadMapper {
    List<Map<String,Object>> getAccessLogTagType(Map<String, Object> map);
}
