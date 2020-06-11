package com.zhixin.rd.rkjc.web.controller.accesslog;

import com.zhixin.rd.rkjc.web.common.ControllerTool;
import com.zhixin.rd.rkjc.web.service.accesslog.IAccessLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Created by zyf on 2017/2/28.
 */
@Controller
@RequestMapping(value = "/rkjc/accesslog")
public class AccessLogController {
    //日志记录
    private static final Logger logger = LoggerFactory.getLogger(AccessLogController.class);
    @Autowired
    private IAccessLogService accessLogService;

    @RequestMapping(value = "/accesslog")
    @ResponseBody
    public Map<String,Object> queryAccessLog(@RequestParam Map<String, Object> params) {
        logger.info("===========accsslogaccesslog param==============="+params);
        Map<String, Object> map = ControllerTool.mapFilter(params);
        Map<String,Object> result = new HashMap<>() ;
        result.put("total",accessLogService.queryAllAccessLog());
        result.put("rows",accessLogService.queryAccessLog(map));
        return  result;
    }
}
