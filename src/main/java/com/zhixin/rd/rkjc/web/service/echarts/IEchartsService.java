package com.zhixin.rd.rkjc.web.service.echarts;

import java.util.List;
import java.util.Map;

/**
 * Created by 19703 on 2017/3/16.
 */
public interface IEchartsService {
    List<Map<String,Object>> getAccessLogTagType(Map<String, Object> map);
}
