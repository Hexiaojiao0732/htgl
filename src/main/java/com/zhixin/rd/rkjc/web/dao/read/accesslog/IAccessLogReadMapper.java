package com.zhixin.rd.rkjc.web.dao.read.accesslog;

import com.zhixin.rd.rkjc.web.entity.AccessLogEntity;


import java.util.List;
import java.util.Map;

/**
 * Created by zyf on 2017/2/28.
 */
public interface IAccessLogReadMapper {


    public List<AccessLogEntity> queryAccessLog(Map<String, Object> map);
    public Integer queryAllAccessLog();

    public List<AccessLogEntity> queryInterfaceNum();


}
