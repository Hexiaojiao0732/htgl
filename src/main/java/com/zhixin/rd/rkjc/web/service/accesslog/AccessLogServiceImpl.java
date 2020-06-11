package com.zhixin.rd.rkjc.web.service.accesslog;

import com.zhixin.rd.rkjc.web.dao.read.accesslog.IAccessLogReadMapper;
import com.zhixin.rd.rkjc.web.entity.AccessLogEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zyf on 2017/2/28.
 */
@Service
public class AccessLogServiceImpl implements IAccessLogService {

    @Autowired
    private IAccessLogReadMapper accessLogMapper;

    public List<AccessLogEntity> queryAccessLog(Map<String,Object> map) {
        return accessLogMapper.queryAccessLog(map);
    }

    public Integer queryAllAccessLog(){
        return  accessLogMapper.queryAllAccessLog();
    }

    @Override
    public List<AccessLogEntity> queryInterfaceNum() {
        return accessLogMapper.queryInterfaceNum();
    }


}
