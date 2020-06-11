package com.zhixin.rd.rkjc.web.controller.dzk;

import com.alibaba.fastjson.JSON;
import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.rkjc.web.common.HttpClientUtil;
import com.zhixin.rd.rkjc.web.common.PropertyUtil;
import com.zhixin.rd.rkjc.web.service.personinfo.IPersonInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/rkjc/dzk")
public class DzkController {

    private static final Logger logger = LoggerFactory.getLogger(DzkController.class);

    @Autowired
    private IPersonInfoService personInfoService;

    @RequestMapping(value = "/getDzBySfzh")
    @ResponseBody
    public MessageEntity getDzBySfzh(@RequestBody Map<String, String> map) throws Exception {
        String jsonStr=JSON.toJSONString(map);
        logger.info("getPersonInfo===jsonStr"+jsonStr);
        String url=PropertyUtil.getContextProperty("dzinfo.url").toString();
        String result;
        try{
            result=HttpClientUtil.personInfo(url, jsonStr);
            logger.info("getPersonInfo===result"+result);
        }catch (Exception e){
            logger.info(e.getMessage());
            return  new MessageEntity().addIsError(true);
        }
        return  new MessageEntity().addIsError(false).addContent(result).addCallbackData(jsonStr).addTitle("Post请求："+url);

    }
}
