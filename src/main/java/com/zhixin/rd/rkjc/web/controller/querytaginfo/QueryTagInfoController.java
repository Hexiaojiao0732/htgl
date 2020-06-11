package com.zhixin.rd.rkjc.web.controller.querytaginfo;

import com.zhixin.rd.rkjc.web.entity.TagTypeEntity;
import com.zhixin.rd.rkjc.web.service.tagType.ITagTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zyf on 2017/3/6.
 */
@Controller
@RequestMapping(value = "/rkjc/querytaginfo")
public class QueryTagInfoController {
    //日志记录
    private static final Logger logger = LoggerFactory.getLogger(QueryTagInfoController.class);
    @Autowired
    private ITagTypeService service;

    @RequestMapping(value = "/select")
    @ResponseBody
    public String queryByTag(Long pid,Long ts,String suf,String bq){
        System.out.print("身份证号"+pid);
        System.out.print("条数"+ts);
        System.out.print("算法"+suf);
        System.out.print("标签"+bq);
        return  null;
    }

    @RequestMapping(value = "/queryTag")
    @ResponseBody
    public List<TagTypeEntity> queryTag(){
        logger.info("===========QuerytaginfoQueryTag===============");

       // List<TagTypeEntity> list = service.queryAll();

        return null;

    }

}
