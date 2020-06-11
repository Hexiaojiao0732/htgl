package com.zhixin.rd.rkjc.web.service.echarts;

import com.zhixin.rd.rkjc.web.dao.read.echarts.IEchartsReadMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

/**
 * Created by 19703 on 2017/3/16.
 */
@Service
public class EchartsServiceImpl implements IEchartsService{

    private static Logger logger = Logger.getLogger(EchartsServiceImpl.class);

    @Autowired
    private IEchartsReadMapper echartsMapper;

    @Override
    public List<Map<String,Object>> getAccessLogTagType(Map<String, Object> map) {
        return echartsMapper.getAccessLogTagType(map);
    }
}
