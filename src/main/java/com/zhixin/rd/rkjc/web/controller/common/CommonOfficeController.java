package com.zhixin.rd.rkjc.web.controller.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.rkjc.web.common.BaseConfig;
import com.zhixin.rd.rkjc.web.common.FreemarkerUtil;
import com.zhixin.rd.rkjc.web.common.OfficeUtil;

import freemarker.template.TemplateException;

@Controller
@RequestMapping("/office")
public class CommonOfficeController {

    @RequestMapping("/view")
    @ResponseBody
    public MessageEntity officeView(@RequestParam int type) throws IOException, TemplateException {//type：1,word；2,execl；
        String path = BaseConfig.getInstance().getOfficeFileDir();
        String templatePath =BaseConfig.getInstance().getTemplateDir();
        //生成对应数据
        Map mapq=new HashMap();
        String fileName = "";
        String xmlFileName = "";
        if (type==1){
            fileName = "wordTemplate.doc";
            xmlFileName = "5通用体貌特征表(开发板)1.xml";
            mapq.put("name", "测试名称");
            mapq.put("sex", "  ☑男  ☐女 ");
            mapq.put("age", 18);
            mapq.put("involvedType", "  ☑罪名  ☐行政案由 ");
            List<Map> list = new ArrayList<Map>();
            Map map1 = new HashMap();
            map1.put("item", "吃饭");
            map1.put("date", new Date().toLocaleString());
            map1.put("startDate", new Date().toLocaleString());
            map1.put("endDate", new Date().toLocaleString());
            list.add(map1);
            Map map2 = new HashMap();
            map2.put("item", "睡觉");
            map2.put("date", new Date().toLocaleString());
            map2.put("startDate", new Date().toLocaleString());
            map2.put("endDate", new Date().toLocaleString());
            list.add(map2);
            int size = list.size();
            if(size<10){
                for (int i=0; i<(10 - size); i++){
                    Map map = new HashMap();
                    map.put("item", "");
                    map.put("date", "");
                    map.put("startDate", "");
                    map.put("endDate", "");
                    list.add(map);
                }
            }
            mapq.put("list", list);
        } else if(type==2){
            fileName = "execlTemplate.xls";
            xmlFileName = "吸毒人员登记表(开发版).xml";
            mapq.put("name", "测试名称");
            mapq.put("asName", "测试别名");
            mapq.put("sex", 18);
            mapq.put("nation", "汉族");
            mapq.put("birthDate", new Date().toLocaleString());
            mapq.put("height", "170cm");
            mapq.put("IDNumber", "232387982798234");
            mapq.put("currState", "良好");
            mapq.put("serviceAddr", "测试服务场所");
            mapq.put("policeStationName", "测试户籍派出所");
            mapq.put("address", "户籍地址");
            mapq.put("currAddress", "居住地址");
            mapq.put("currPoliceStationName", "居住派出所");
            mapq.put("phone", "1333232323");
            mapq.put("tel", "23123232");
            mapq.put("qq", "122323231");
            mapq.put("condition", "测试病情");
            mapq.put("type", "测试类型");
        }
        path += fileName;
        //生成模板文件
        FreemarkerUtil.process(templatePath, xmlFileName, path, mapq);

        //预览
        String converPath = path + ".html";
        if (type==1){
            OfficeUtil.wordTohtml(path, converPath);
        }else if(type==2){
            OfficeUtil.excelTohtml(path, converPath);
        }else{
            return new MessageEntity().addIsError(true).addContent("类型错误!");
        }
        return new MessageEntity().addIsError(false).addContent(fileName + ".html");
    }

    @RequestMapping(value = "/wordxml")
    public void export(HttpServletRequest request,HttpServletResponse response) throws Exception {
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/x-download");
        response.setHeader("Pragma", "public");
        response.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
        response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("5通用体貌特征表", "UTF-8") + ".doc");
        Map mapq=new HashMap();
		mapq.put("policeStationName", "北京市公安局海淀分局四季青派出所");
		mapq.put("name", "李世林");
        mapq.put("sex", "男");
        mapq.put("address", "重庆市巫溪县徐家镇岔路村4组");
        mapq.put("birthDate", "1989年9月11日");
        mapq.put("IDName", "500238198909114857");
        mapq.put("nation", "汉族");
        mapq.put("height", "165cm");
        mapq.put("weight", "60kg");
        mapq.put("posture", "中等");
        mapq.put("feature", "椭圆");
        mapq.put("hairStyle", "短");
        mapq.put("shoeSize", "39码");
        mapq.put("complexion", "黄");
        mapq.put("eye", "椭圆 ");
        mapq.put("eyebrow", "浓");
        mapq.put("nose", "直");
        mapq.put("tooth", "齐");
        mapq.put("ear", "椭圆");
        mapq.put("physiologyFeature", "生理特征");
        mapq.put("otherFeature", "其他特征");
        PrintWriter out = response.getWriter();
        URL url = Thread.currentThread().getContextClassLoader()
                .getResource("");
        String templatePath =url.getPath()+"template";
        FreemarkerUtil.process(templatePath, "5通用体貌特征表(开发板)1.xml", mapq, out);
    }

    @RequestMapping(value = "/wordlistxml")
    public void export2(HttpServletRequest request,HttpServletResponse response) throws Exception {
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/x-download");
        response.setHeader("Pragma", "public");
        response.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
        String fileName= "18违法人员饮食和休息登记表";
        if(request.getHeader("User-Agent").toLowerCase().indexOf("firefox") > 0){
            fileName = new String(fileName.getBytes("UTF-8"), "ISO8859-1");
        }else{
            fileName = URLEncoder.encode(fileName, "UTF-8");
        }
        response.addHeader("Content-Disposition", "attachment;filename=" + fileName + ".doc");
        Map mapq=new HashMap();
        mapq.put("name", "测试名称");
        mapq.put("sex", "  ☑男  ☐女 ");
        mapq.put("age", 18);
        mapq.put("involvedType", "  ☑罪名  ☐行政案由 ");
        List<Map> list = new ArrayList<Map>();
        Map map1 = new HashMap();
        map1.put("item", "吃饭");
        map1.put("date", new Date().toLocaleString());
        map1.put("startDate", new Date().toLocaleString());
        map1.put("endDate", new Date().toLocaleString());
        list.add(map1);
        Map map2 = new HashMap();
        map2.put("item", "睡觉");
        map2.put("date", new Date().toLocaleString());
        map2.put("startDate", new Date().toLocaleString());
        map2.put("endDate", new Date().toLocaleString());
        list.add(map2);
        int size = list.size();
        if(size<10){
            for (int i=0; i<(10 - size); i++){
                Map map = new HashMap();
                map.put("item", "");
                map.put("date", "");
                map.put("startDate", "");
                map.put("endDate", "");
                list.add(map);
            }
        }
        mapq.put("list", list);
        PrintWriter out = response.getWriter();
        URL url = Thread.currentThread().getContextClassLoader()
                .getResource("");
        String templatePath =url.getPath()+"template";
        FreemarkerUtil.process(templatePath, "18违法人员饮食和休息登记表(开发版).xml", mapq, out);
    }

    @RequestMapping(value = "/execlxml")
    public void export3(HttpServletRequest request,HttpServletResponse response) throws Exception {
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/x-download");
        response.setHeader("Pragma", "public");
        response.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
        String fileName= "吸毒人员登记表";
        if(request.getHeader("User-Agent").toLowerCase().indexOf("firefox") > 0){
            fileName = new String(fileName.getBytes("UTF-8"), "ISO8859-1");
        }else{
            fileName = URLEncoder.encode(fileName, "UTF-8");
        }
        response.addHeader("Content-Disposition", "attachment;filename=" + fileName + ".xls");
        Map mapq=new HashMap();
        mapq.put("name", "测试名称");
        mapq.put("asName", "测试别名");
        mapq.put("sex", 18);
        mapq.put("nation", "汉族");
        mapq.put("birthDate", new Date().toLocaleString());
        mapq.put("height", "170cm");
        mapq.put("IDNumber", "232387982798234");
        mapq.put("currState", "良好");
        mapq.put("serviceAddr", "测试服务场所");
        mapq.put("policeStationName", "测试户籍派出所");
        mapq.put("address", "户籍地址");
        mapq.put("currAddress", "居住地址");
        mapq.put("currPoliceStationName", "居住派出所");
        mapq.put("phone", "1333232323");
        mapq.put("tel", "23123232");
        mapq.put("qq", "122323231");
        mapq.put("condition", "测试病情");
        mapq.put("type", "测试类型");
        PrintWriter out = response.getWriter();
        URL url = Thread.currentThread().getContextClassLoader()
                .getResource("");
        String templatePath =url.getPath()+"template";
        FreemarkerUtil.process(templatePath, "吸毒人员登记表(开发版).xml", mapq, out);
    }

    //直接生成文件
    @RequestMapping(value = "/wordxmlfile")
    public void export4(HttpServletRequest request,HttpServletResponse response) throws Exception {
        Map mapq=new HashMap();
        mapq.put("policeStationName", "北京市公安局海淀分局四季青派出所");
        mapq.put("name", "李世林");
        mapq.put("sex", "男");
        mapq.put("address", "重庆市巫溪县徐家镇岔路村4组");
        mapq.put("birthDate", "1989年9月11日");
        mapq.put("IDName", "500238198909114857");
        mapq.put("nation", "汉族");
        mapq.put("height", "165cm");
        mapq.put("weight", "60kg");
        mapq.put("posture", "中等");
        mapq.put("feature", "椭圆");
        mapq.put("hairStyle", "短");
        mapq.put("shoeSize", "39码");
        mapq.put("complexion", "黄");
        mapq.put("eye", "椭圆 ");
        mapq.put("eyebrow", "浓");
        mapq.put("nose", "直");
        mapq.put("tooth", "齐");
        mapq.put("ear", "椭圆");
        mapq.put("physiologyFeature", "生理特征");
        mapq.put("otherFeature", "其他特征");
        
        URL url = Thread.currentThread().getContextClassLoader()
                .getResource("");
        String templatePath =BaseConfig.getInstance().getTemplateDir();
        String classesPath = CommonOfficeController.class.getResource("/").getPath();

        String path = BaseConfig.getInstance().getOfficeFileDir() + "test4.doc";
        FreemarkerUtil.process(templatePath, "5通用体貌特征表(开发板)1.xml", path, mapq);
    }
    //1涉案物品管理台账
    @RequestMapping("/viewtest")
    @ResponseBody
    public MessageEntity officeViewtest(@RequestParam int type) throws IOException, TemplateException {//type：1,word；2,execl；
        String templatePath = BaseConfig.getInstance().getTemplateDir();
        //生成对应数据
        Map mapq=new HashMap();
        String fileName = "";
        String xmlFileName = "";
        if (type==1){
        } else if(type==2){
            fileName = "涉案物品管理台账.xls";
            xmlFileName = "涉案物品管理台账.xml";
            mapq.put("interrogateAreaName", "测试名称");
            mapq.put("caseName", "XX盗窃案");
            mapq.put("mobile", "手机");
            mapq.put("count", 1);
            //mapq.put("birthDate", new Date().toLocaleString());
            mapq.put("phoneStyle", "诺基亚N70黑色");
            mapq.put("casePro", "扣押");
            mapq.put("inTime", "2013.1.1");
            mapq.put("sender", "XX");
            mapq.put("reciever", "XXX");
            mapq.put("borrowTime", "2013.1.1");
            mapq.put("borrower", "XX");
            mapq.put("resendTime", "2013.1.1");
            mapq.put("finalResult", "发还事主XX");
            mapq.put("agent", "XXX");
        }
        String path = BaseConfig.getInstance().getOfficeFileDir()+fileName;
        //生成模板文件
        FreemarkerUtil.process(templatePath, xmlFileName, path, mapq);

        //预览
        String converPath = path + ".html";
        if (type==1){
            OfficeUtil.wordTohtml(path, converPath);
        }else if(type==2){
            OfficeUtil.excelTohtml(path, converPath);
        }else{
            return new MessageEntity().addIsError(true).addContent("类型错误!");
        }
        return new MessageEntity().addIsError(false).addContent(fileName + ".html");
    }

    //1涉案物品管理台账
    @RequestMapping("/viewtest1")
    @ResponseBody
    public MessageEntity officeViewtest1(@RequestParam int type) throws IOException, TemplateException {//type：1,word；2,execl；
        String templatePath =BaseConfig.getInstance().getTemplateDir();
        //生成对应数据
        Map mapq=new HashMap();
        String fileName = "";
        String xmlFileName = "";
        if (type==1){
        	  fileName = "随身物品登记.doc";
              xmlFileName = "随身物品登记.xml";
              List<Map> list = new ArrayList<Map>();
              mapq.put("branch", "1");
              mapq.put("policeStation", "2");
              mapq.put("name", "3");
              mapq.put("identityCard", "4");
              mapq.put("caseReason", "5");
              mapq.put("source", "6");
              mapq.put("no", 7);
              mapq.put("objectName", "8");
              mapq.put("objectCount", "9");
              mapq.put("characteristics", "10");
              mapq.put("objectspace", "11");
              mapq.put("handling", "12");
              mapq.put("date", "13");
              mapq.put("receiver", "14");
              mapq.put("policeman", "15");
              mapq.put("legalMember", "16");
              mapq.put("connent","17");
              mapq.put("recieverPhoneno", "18");
              mapq.put("recieverstate", "19"); 
              mapq.put("receiverName", "20");
              mapq.put("receiverDate", "21");
              list.add(mapq);
              int size = list.size();
              if(size<10){
                  for (int i=0; i<(10 - size); i++){
                      Map map = new HashMap();
                      map.put("branch", "");
                      map.put("policeStation", "X");
                      map.put("name", "");
                      map.put("identityCard", "");
                      map.put("caseReason", "");
                      map.put("source ", "");
                      map.put("no", "");
                      map.put("objectName", "");
                      map.put("objectCount", "");
                      map.put("characteristics", "");
                      map.put("objectspace", "");
                      map.put("handling", "");
                      map.put("date", "");
                      map.put("receiver", "");
                      map.put("policeman", "");
                      map.put("legalMember", "");
                      list.add(map);
                  }
              }
              mapq.put("list", list);

        } else if(type==2){
          
        }
        String path = BaseConfig.getInstance().getOfficeFileDir() +fileName;
        //生成模板文件
        FreemarkerUtil.process(templatePath, xmlFileName, path, mapq);

        //预览
        String converPath = path + ".html";
        if (type==1){
            OfficeUtil.wordTohtml(path, converPath);
        }else if(type==2){
            OfficeUtil.excelTohtml(path, converPath);
        }else{
            return new MessageEntity().addIsError(true).addContent("类型错误!");
        }
        return new MessageEntity().addIsError(false).addContent(fileName + ".html");
    }
    
    //2犯罪嫌疑人人身安全检查 情况登记表
    @RequestMapping("/viewtest2")
    @ResponseBody
    public MessageEntity officeViewtest2(@RequestParam int type) throws IOException, TemplateException {//type：1,word；2,execl；
        String templatePath = BaseConfig.getInstance().getTemplateDir();
        //生成对应数据
        Map mapq=new HashMap();
        String fileName = "";
        String xmlFileName = "";
        if (type==1){
        	  fileName = "违法犯罪嫌疑人人身安全检查情况登记表.doc";
              xmlFileName = "违法犯罪嫌疑人人身安全检查情况登记表.xml";
              List<Map> list = new ArrayList<Map>();
              mapq.put("year_s", "1");
              mapq.put("month_s", "2");
              mapq.put("day_s", "3");
              mapq.put("hour_s", 4);
              mapq.put("minute_s", "5");
              mapq.put("year_e", "6");
              mapq.put("month_e", 7);
              mapq.put("day_e", "8");
              mapq.put("hour_e", "9");
              mapq.put("minute_e", "10");
              mapq.put("checkedName", "11");
              mapq.put("sex", "12");
              mapq.put("age", "13");
              mapq.put("caseProperty", "14");
              mapq.put("caseReason", "15");
              mapq.put("caseHistory", "16");
              mapq.put("state_body","17");
              mapq.put("state_injury", "18");
              mapq.put("descirption", "19"); 
              mapq.put("checkedName", "20");
              mapq.put("checkName", "21");
              mapq.put("legalMember", "22");
              mapq.put("isinjuery", "  ☑无  ☐有 ");
        } else if(type==2){
          
        }
        String path = BaseConfig.getInstance().getOfficeFileDir() +fileName;
        //生成模板文件
        FreemarkerUtil.process(templatePath, xmlFileName, path, mapq);

        //预览
        String converPath = path + ".html";
        if (type==1){
            OfficeUtil.wordTohtml(path, converPath);
        }else if(type==2){
            OfficeUtil.excelTohtml(path, converPath);
        }else{
            return new MessageEntity().addIsError(true).addContent("类型错误!");
        }
        return new MessageEntity().addIsError(false).addContent(fileName + ".html");
    }
    
    //3送案表
    @RequestMapping("/viewtest3")
    @ResponseBody
    public MessageEntity officeViewtest3(@RequestParam int type) throws IOException, TemplateException {//type：1,word；2,execl；
        String templatePath = BaseConfig.getInstance().getTemplateDir();
        //生成对应数据
        Map mapq=new HashMap();
        String fileName = "";
        String xmlFileName = "";
        if (type==1){
        	  fileName = "送案表.doc";
              xmlFileName = "送案表.xml";
              List<Map> list = new ArrayList<Map>();
              mapq.put("year_s", "1");
              mapq.put("month_s", "2");
              mapq.put("day_s", "3");
              mapq.put("hour_s", 4);
              mapq.put("minute_s", "5");
              mapq.put("year_e", "6");
              mapq.put("month_e", 7);
              mapq.put("day_e", "8");
              mapq.put("hour_e", "9");
              mapq.put("minute_e", "10");
              mapq.put("name", "11");
              mapq.put("sex", "12");
              mapq.put("age", "13");
              mapq.put("national", "14");
              mapq.put("workUnit", "15");
              mapq.put("domicile", "16");
              mapq.put("politicalNature","17");
              mapq.put("healthy", "18");
              mapq.put("LegalFormalities", "19"); 
              mapq.put("base", "20");
              mapq.put("evidence", "21");
              mapq.put("advice", "22");
              mapq.put("leaderAdvaice", "23");
              mapq.put("tel", "24");
        } else if(type==2){
          
        }
        String path = BaseConfig.getInstance().getOfficeFileDir() +fileName;
        //生成模板文件
        FreemarkerUtil.process(templatePath, xmlFileName, path, mapq);

        //预览
        String converPath = path + ".html";
        if (type==1){
            OfficeUtil.wordTohtml(path, converPath);
        }else if(type==2){
            OfficeUtil.excelTohtml(path, converPath);
        }else{
            return new MessageEntity().addIsError(true).addContent("类型错误!");
        }
        return new MessageEntity().addIsError(false).addContent(fileName + ".html");
    }
    
  //4进出台账登记
    @RequestMapping("/viewtest4")
    @ResponseBody
    public MessageEntity officeViewtest4(@RequestParam int type) throws IOException, TemplateException {//type：1,word；2,execl；
        String templatePath = BaseConfig.getInstance().getTemplateDir();
        //生成对应数据
        Map mapq=new HashMap();
        String fileName = "";
        String xmlFileName = "";
        if (type==1){
        	  fileName = "涉案人员进出办案区登记台账.doc";
              xmlFileName = "涉案人员进出办案区登记台账.xml";
              List<Map> list = new ArrayList<Map>();
              mapq.put("department", "1");
              mapq.put("approver", "2");
              mapq.put("name", "3");
              mapq.put("sex", 4);
              mapq.put("age", "5");
              mapq.put("isCity", "6");
              mapq.put("caseProptery", 7);
              mapq.put("inReason", "8");
              mapq.put("year", "9");
              mapq.put("month", "10");
              mapq.put("day", "11");
              mapq.put("hour", "12");
              mapq.put("minute", "13");
             // list.add(mapq);
              Map map2 = new HashMap();
              map2.put("hour_s", "14");
              map2.put("minute_s", "15");
              map2.put("hour_e", "16");
              map2.put("minute_e", "17");
              map2.put("roomName", "18");
              map2.put("investigators", "19");
              map2.put("legalMember", "20");
              list.add(map2);
              
              int size = list.size();
              if(size<10){
                  for (int i=0; i<(10 - size); i++){
                      Map map = new HashMap();
                      map.put("hour_s", "");
                      map.put("minute_s", "");
                      map.put("hour_e", "");
                      map.put("minute_e", "");
                      map.put("roomName", "");
                      map.put("investigators", "");
                      map.put("legalMember", "");
                      list.add(map);
                  }
              }
              mapq.put("list", list);
        } else if(type==2){
          
        }
        String path = BaseConfig.getInstance().getOfficeFileDir() +fileName;
        //生成模板文件
        FreemarkerUtil.process(templatePath, xmlFileName, path, mapq);

        //预览
        String converPath = path + ".html";
        if (type==1){
            OfficeUtil.wordTohtml(path, converPath);
        }else if(type==2){
            OfficeUtil.excelTohtml(path, converPath);
        }else{
            return new MessageEntity().addIsError(true).addContent("类型错误!");
        }
        return new MessageEntity().addIsError(false).addContent(fileName + ".html");
    }
    
  //5三室录像底联说明
    @RequestMapping("/viewtest5")
    @ResponseBody
    public MessageEntity officeViewtest5(@RequestParam int type) throws IOException, TemplateException {//type：1,word；2,execl；
        String templatePath = BaseConfig.getInstance().getTemplateDir();
        //生成对应数据
        Map mapq=new HashMap();
        String fileName = "";
        String xmlFileName = "";
        if (type==1){
        	  fileName = "三室录像底联说明.doc";
              xmlFileName = "三室录像底联说明.xml";
              List<Map> list = new ArrayList<Map>();
              mapq.put("caseName", "1");
              mapq.put("caseContent", "2");
              mapq.put("year", "3");
              mapq.put("month", 4);
              mapq.put("day", "5");
              mapq.put("space", "6");
              mapq.put("method", 7);
              mapq.put("resouce", "8");
              mapq.put("scope", "9");
              mapq.put("reason", "10");
              mapq.put("saveSpace", "11");
              mapq.put("handSpace", "12");
        } else if(type==2){
          
        }
        String path = BaseConfig.getInstance().getOfficeFileDir() +fileName;
        //生成模板文件
        FreemarkerUtil.process(templatePath, xmlFileName, path, mapq);

        //预览
        String converPath = path + ".html";
        if (type==1){
            OfficeUtil.wordTohtml(path, converPath);
        }else if(type==2){
            OfficeUtil.excelTohtml(path, converPath);
        }else{
            return new MessageEntity().addIsError(true).addContent("类型错误!");
        }
        return new MessageEntity().addIsError(false).addContent(fileName + ".html");
    }

    //6伤情照片底联说明
    @RequestMapping("/viewtest6")
    @ResponseBody
    public MessageEntity officeViewtest6(@RequestParam int type) throws IOException, TemplateException {//type：1,word；2,execl；
        String templatePath = BaseConfig.getInstance().getTemplateDir();
        //生成对应数据
        Map mapq=new HashMap();
        String fileName = "";
        String xmlFileName = "";
        if (type==1){
        	  fileName = "伤情照片底联说明.doc";
              xmlFileName = "伤情照片底联说明.xml";
              List<Map> list = new ArrayList<Map>();
              mapq.put("caseName", "1");
              mapq.put("year", "3");
              mapq.put("month", 4);
              mapq.put("day", "5");
              mapq.put("produceSpace", "6");
              mapq.put("saveSpace", 7);
              mapq.put("state", "8");
              mapq.put("handSpace", "9");
        } else if(type==2){
          
        }
        String path = BaseConfig.getInstance().getOfficeFileDir() + fileName;
        //生成模板文件
        FreemarkerUtil.process(templatePath, xmlFileName, path, mapq);

        //预览
        String converPath = path + ".html";
        if (type==1){
            OfficeUtil.wordTohtml(path, converPath);
        }else if(type==2){
            OfficeUtil.excelTohtml(path, converPath);
        }else{
            return new MessageEntity().addIsError(true).addContent("类型错误!");
        }
        return new MessageEntity().addIsError(false).addContent(fileName + ".html");
    }
    
    
    
    @RequestMapping(value = "/execlxmltest")
    public void export3test(HttpServletRequest request,HttpServletResponse response) throws Exception {
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/x-download");
        response.setHeader("Pragma", "public");
        response.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
        String fileName= "涉案物品管理台账";
        if(request.getHeader("User-Agent").toLowerCase().indexOf("firefox") > 0){
            fileName = new String(fileName.getBytes("UTF-8"), "ISO8859-1");
        }else{
            fileName = URLEncoder.encode(fileName, "UTF-8");
        }
        response.addHeader("Content-Disposition", "attachment;filename=" + fileName + ".xls");
        Map mapq=new HashMap();
        mapq.put("interrogateAreaName", "测试名称");
        mapq.put("caseName", "XX盗窃案");
        mapq.put("mobile", "手机");
        mapq.put("count", 1);
        //mapq.put("birthDate", new Date().toLocaleString());
        mapq.put("phoneStyle", "诺基亚N70黑色");
        mapq.put("casePro", "扣押");
        mapq.put("inTime", "2013.1.1");
        mapq.put("sender", "XX");
        mapq.put("reciever", "XXX");
        mapq.put("borrowTime", "2013.1.1");
        mapq.put("borrower", "XX");
        mapq.put("resendTime", "2013.1.1");
        mapq.put("finalResult", "发还事主XX");
        mapq.put("agent", "XXX");
        PrintWriter out = response.getWriter();
        URL url = Thread.currentThread().getContextClassLoader()
                .getResource("");
        String templatePath =url.getPath()+"template";
        FreemarkerUtil.process(templatePath, "涉案物品管理台账.xml", mapq, out);
    }
    
    @RequestMapping("/viewevdphoto")
    @ResponseBody
    public MessageEntity officeView1(@RequestParam int type) throws IOException, TemplateException {//type：1,word；2,execl；
        String templatePath = BaseConfig.getInstance().getTemplateDir();
        //生成对应数据
        Map mapq=new HashMap();
        String fileName = "";
        String xmlFileName = "";
        if (type==1){
            fileName = "24物证照片底联说明.doc";
            xmlFileName = "24物证照片底联说明.xml";
            mapq.put("casename", "案件名称");
            mapq.put("mtime", "制作时间");
            mapq.put("mplace", "制作地点");
            mapq.put("evidinfo", "说明物证的名称、特征、数量、质量");
            mapq.put("evidplace", "原物存放地点");
            mapq.put("check", "以上物证照片是否已与原物核实无异");
            mapq.put("cameraman", "拍摄人");
            mapq.put("witness", "见证人");
            mapq.put("party", "当事人");
            mapq.put("producer", "制作人");
            mapq.put("unit", "办案单位");
           
        } else if(type==2){
            fileName = "execlTemplate.xls";
            xmlFileName = "吸毒人员登记表(开发版).xml";
            mapq.put("name", "测试名称");
            mapq.put("asName", "测试别名");
            mapq.put("sex", 18);
            mapq.put("nation", "汉族");
            mapq.put("birthDate", new Date().toLocaleString());
            mapq.put("height", "170cm");
            mapq.put("IDNumber", "232387982798234");
            mapq.put("currState", "良好");
            mapq.put("serviceAddr", "测试服务场所");
            mapq.put("policeStationName", "测试户籍派出所");
            mapq.put("address", "户籍地址");
            mapq.put("currAddress", "居住地址");
            mapq.put("currPoliceStationName", "居住派出所");
            mapq.put("phone", "1333232323");
            mapq.put("tel", "23123232");
            mapq.put("qq", "122323231");
            mapq.put("condition", "测试病情");
            mapq.put("type", "测试类型");
        }
        String path = BaseConfig.getInstance().getOfficeFileDir()+fileName;
        //生成模板文件
        FreemarkerUtil.process(templatePath, xmlFileName, path, mapq);

        //预览
        String converPath = path + ".html";
        if (type==1){
            OfficeUtil.wordTohtml(path, converPath);
        }else if(type==2){
            OfficeUtil.excelTohtml(path, converPath);
        }else{
            return new MessageEntity().addIsError(true).addContent("类型错误!");
        }
        return new MessageEntity().addIsError(false).addContent(fileName + ".html");
    }

    @RequestMapping("/viewevdvidio")
    @ResponseBody
    public MessageEntity viewevdvidio(@RequestParam int type) throws IOException, TemplateException {//type：1,word；2,execl；
        String templatePath = BaseConfig.getInstance().getTemplateDir();
        //生成对应数据
        Map mapq=new HashMap();
        String fileName = "";
        String xmlFileName = "";
        if (type==1){
            fileName = "24现场、搜查执法记录仪录像底联说明.doc";
            xmlFileName = "24现场、搜查执法记录仪录像底联说明.xml";
            mapq.put("casename", "案件名称");
            mapq.put("evidinfo", "资料内容");
            mapq.put("format", "格式");
            mapq.put("evidtime", "提取时间");
            mapq.put("evidplace", "提取地点");
            mapq.put("evidmethod", "提取条件和方法");
            mapq.put("videosource", "视频资料来源");
            mapq.put("original", "以上视频资料是否为原件");
            mapq.put("reason", "无法调取视频原件的原因");
            mapq.put("originalplace", "原件的存放地点");
            mapq.put("witness", "见证人");
            mapq.put("producer", "制作人");
            mapq.put("pname", "办案民警");
            mapq.put("unit", "办案单位");
           
        } else if(type==2){
            fileName = "execlTemplate.xls";
            xmlFileName = "吸毒人员登记表(开发版).xml";
            mapq.put("name", "测试名称");
            mapq.put("asName", "测试别名");
            mapq.put("sex", 18);
            mapq.put("nation", "汉族");
            mapq.put("birthDate", new Date().toLocaleString());
            mapq.put("height", "170cm");
            mapq.put("IDNumber", "232387982798234");
            mapq.put("currState", "良好");
            mapq.put("serviceAddr", "测试服务场所");
            mapq.put("policeStationName", "测试户籍派出所");
            mapq.put("address", "户籍地址");
            mapq.put("currAddress", "居住地址");
            mapq.put("currPoliceStationName", "居住派出所");
            mapq.put("phone", "1333232323");
            mapq.put("tel", "23123232");
            mapq.put("qq", "122323231");
            mapq.put("condition", "测试病情");
            mapq.put("type", "测试类型");
        }
        String path = BaseConfig.getInstance().getOfficeFileDir()+fileName;
        //生成模板文件
        FreemarkerUtil.process(templatePath, xmlFileName, path, mapq);

        //预览
        String converPath = path + ".html";
        if (type==1){
            OfficeUtil.wordTohtml(path, converPath);
        }else if(type==2){
            OfficeUtil.excelTohtml(path, converPath);
        }else{
            return new MessageEntity().addIsError(true).addContent("类型错误!");
        }
        return new MessageEntity().addIsError(false).addContent(fileName + ".html");
    }
    
    @RequestMapping("/viewcaseplace")
    @ResponseBody
    public MessageEntity viewcaseplace(@RequestParam int type) throws IOException, TemplateException {//type：1,word；2,execl；
        String templatePath =BaseConfig.getInstance().getTemplateDir();
        //生成对应数据
        Map mapq=new HashMap();
        String fileName = "";
        String xmlFileName = "";
        if (type==1){
            fileName = "24作案地点照片底联说明.doc";
            xmlFileName = "24作案地点照片底联说明.xml";
            mapq.put("casename", "案件名称");
            mapq.put("mtime", "制作时间");
            mapq.put("mplace", "制作地点");
            mapq.put("photoinfo", "说明照片的名称、特征、数量、质量");
            mapq.put("originalplace", "原件的存放地点");
            mapq.put("check", "以上物证照片是否已与原物核实无异");
            mapq.put("cameraman", "拍摄人");
            mapq.put("witness", "见证人");
            mapq.put("party", "当事人");
            mapq.put("producer", "制作人");
            mapq.put("unit", "办案单位");
           
        } else if(type==2){
            fileName = "execlTemplate.xls";
            xmlFileName = "吸毒人员登记表(开发版).xml";
            mapq.put("name", "测试名称");
            mapq.put("asName", "测试别名");
            mapq.put("sex", 18);
            mapq.put("nation", "汉族");
            mapq.put("birthDate", new Date().toLocaleString());
            mapq.put("height", "170cm");
            mapq.put("IDNumber", "232387982798234");
            mapq.put("currState", "良好");
            mapq.put("serviceAddr", "测试服务场所");
            mapq.put("policeStationName", "测试户籍派出所");
            mapq.put("address", "户籍地址");
            mapq.put("currAddress", "居住地址");
            mapq.put("currPoliceStationName", "居住派出所");
            mapq.put("phone", "1333232323");
            mapq.put("tel", "23123232");
            mapq.put("qq", "122323231");
            mapq.put("condition", "测试病情");
            mapq.put("type", "测试类型");
        }
        String path = BaseConfig.getInstance().getOfficeFileDir()+fileName;
        //生成模板文件
        FreemarkerUtil.process(templatePath, xmlFileName, path, mapq);

        //预览
        String converPath = path + ".html";
        if (type==1){
            OfficeUtil.wordTohtml(path, converPath);
        }else if(type==2){
            OfficeUtil.excelTohtml(path, converPath);
        }else{
            return new MessageEntity().addIsError(true).addContent("类型错误!");
        }
        return new MessageEntity().addIsError(false).addContent(fileName + ".html");
    }
}
