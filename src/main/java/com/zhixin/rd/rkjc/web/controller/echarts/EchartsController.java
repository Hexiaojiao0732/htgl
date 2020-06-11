package com.zhixin.rd.rkjc.web.controller.echarts;

import com.zhixin.rd.rkjc.web.common.ControllerTool;
import com.zhixin.rd.rkjc.web.service.echarts.IEchartsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Created by 19703 on 2017/3/16.
 */
@Controller
@RequestMapping("/rkjc/echarts")
public class EchartsController {

    private static final Logger logger = LoggerFactory.getLogger(EchartsController.class);

    @Autowired
    private IEchartsService echartsService;

    @RequestMapping(value = "/getEcharts")
    @ResponseBody
    public List<Map<String,Object>> getEcharts(@RequestParam Map<String,Object> param, HttpServletRequest request,
                                          HttpServletResponse response){
        Map<String, Object> result = new HashMap<String, Object>();
        Map<String, Object> map = new HashMap<String, Object>();
        List<Map<String,Object>> list= new ArrayList<Map<String,Object>>();
        try {
            logger.info("===========listEcharts===============");
            map = ControllerTool.mapFilter(param);
            list = echartsService.getAccessLogTagType(map);
            //jlist
            List<String> listDate = new ArrayList<String>();
            Date date=new Date();
            int month = date.getDate();
            for (int i=0;i<month;i++) {
                listDate.add((i+1)+"");
            }
            result.put("xDate",listDate);
            list.add(result);
        } catch (Exception e){
            e.printStackTrace();
            logger.error("Error on Echarts! ", e);
        }
        return list;
    }
}
