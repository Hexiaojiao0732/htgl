package com.zhixin.rd.rkjc.web.controller.psk;

import com.alibaba.fastjson.JSON;
import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.rkjc.web.common.HttpClientUtil;
import com.zhixin.rd.rkjc.web.common.ImageUtil;
import com.zhixin.rd.rkjc.web.common.Md5Util;
import com.zhixin.rd.rkjc.web.common.PropertyUtil;
import com.zhixin.rd.rkjc.web.service.personinfo.IPersonInfoService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;

@Controller
@RequestMapping("/rkjc/psk")
public class PskController {

    private static final Logger logger = LoggerFactory.getLogger(PskController.class);

    @Autowired
    private IPersonInfoService personInfoService;

    @RequestMapping(value = "/getPsBySfzh")
    @ResponseBody
    public MessageEntity getPsBySfzh(@RequestBody Map<String, String> map) throws Exception {
        String jsonStr=JSON.toJSONString(map);
        logger.info("getPsBySfzh===jsonStr"+jsonStr);
        String url=PropertyUtil.getContextProperty("psinfo.url").toString();
        String result;
        try{
            result=HttpClientUtil.personInfo(url, jsonStr);
            logger.info("getPsBySfzh===result"+result);
        }catch (Exception e){
            logger.info(e.getMessage());
            return  new MessageEntity().addIsError(true);
        }
        return  new MessageEntity().addIsError(false).addContent(result).addCallbackData(jsonStr).addTitle("Post请求："+url);

    }


    //获取前台图片
    @RequestMapping(value = "/uploadImage")
    public ModelAndView uploadPicture1( HttpServletRequest request,HttpServletResponse response) throws Exception {
        String certificateNo = request.getParameter("personalcertificateNo");
        System.err.println("=====上传图片11111111111111111111111111111=====");
        //String number = request.getParameter("number");
        String finalPath="";
        String filename1 = "";
        String filename2 = "";
        ModelAndView mav = new ModelAndView("rkjc/psk/uploaded");
        // 图片开始
        // 创建一个通用的多部分解析器
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        // 判断 request 是否有文件上传,即多部分请求
        if (multipartResolver.isMultipart(request)) {
            // 转换成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            // 取得request中的所有文件名
            Iterator<String> iter = multiRequest.getFileNames();
            //while (iter.hasNext()) {
            // 记录上传过程起始时的时间，用来计算上传时间
            int pre = (int) System.currentTimeMillis();
            // 取得上传文件
            MultipartFile file = multiRequest.getFile("file");
            MultipartFile file1 = multiRequest.getFile("file1");
            if (file != null) {
                // 取得当前上传文件的文件名称
                String myFileName = file.getOriginalFilename();
                // 如果名称不为“”,说明该文件存在，否则说明该文件不存在

                if (null!= myFileName && !"".equals(myFileName.trim())) {
                    System.out.println("myFileName1=" + myFileName);
                    // 重命名上传后的文件名
                    //serialNo = myFileName.substring(0, 16);
                    String myNewFileName = "imageFirst"+System.currentTimeMillis()+".jpg";
                    String path = (String)PropertyUtil.getContextProperty("combinePhotoSavePath");
                    File localFile = new File(path, myNewFileName);
                    file.transferTo(localFile);
                    finalPath=path+myNewFileName;
                    filename1= myNewFileName;
                    mav.addObject("imgSrc",filename1);
                }
            }
            if (file1 != null) {
                // 取得当前上传文件的文件名称
                String myFileName = file1.getOriginalFilename();
                // 如果名称不为“”,说明该文件存在，否则说明该文件不存在

                if (null!= myFileName && !"".equals(myFileName.trim())) {
                    System.out.println("myFileName2=" + myFileName);
                    // 重命名上传后的文件名
                    String myNewFileName = "imageSecond"+System.currentTimeMillis()+".jpg";
                    String path = (String)PropertyUtil.getContextProperty("combinePhotoSavePath");
                    File localFile = new File(path, myNewFileName);
                    file1.transferTo(localFile);
                    finalPath=path+myNewFileName;
                    filename2= myNewFileName;

                    mav.addObject("imgSrc1",filename2);
                }
            }
        }

        System.err.println("==========myFileName========="+finalPath);


        //mav.addObject("imgCate","lawdocImageSavePath");
        return mav;
    }

    @RequestMapping(value = "/imageshow")
    @ResponseBody
    public void showImage(@RequestParam Map<String, Object> params,HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            logger.info("照片显示："+params.get("path"));
            if("combinePhotoSavePath".equals(params.get("path"))){
                System.err.println("-----combinePhotoSavePath------");
                FileInputStream is = new FileInputStream((PropertyUtil.getContextProperty("combinePhotoSavePath")).toString()+params.get("image"));
                int i = is.available(); // 得到文件大小
                System.out.println(i);
                byte data[] = new byte[i];
                is.read(data); // 读数据
                is.close();
                response.setContentType("image/*"); // 设置返回的文件类型
                OutputStream toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象
                toClient.write(data); // 输出数据
                toClient.close();
            }
            if("imageComparePhotoSavePath".equals(params.get("path"))){
                System.err.println("-----imageComparePhotoSavePath------");
                FileInputStream is = new FileInputStream((PropertyUtil.getContextProperty("imageComparePhotoSavePath")).toString()+params.get("image"));
                int i = is.available(); // 得到文件大小
                System.out.println(i);
                byte data[] = new byte[i];
                is.read(data); // 读数据
                is.close();
                response.setContentType("image/*"); // 设置返回的文件类型
                OutputStream toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象
                toClient.write(data); // 输出数据
                toClient.close();
            }

        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @RequestMapping(value = "/imgVsYt")
    @ResponseBody
    public void imgVsYt(@RequestParam Map<String, Object> params,HttpServletRequest request, HttpServletResponse response) throws Exception {
        String imgUrl = PropertyUtil.getContextProperty("combinePhotoSavePath")+"";
        logger.info("照片地址："+imgUrl);
        String imageBase64 =  ImageUtil.yituGetImageStr(imgUrl);
        logger.info(imageBase64);
        //登录
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "demo04");
        jsonObject.put("password", Md5Util.getMD5("123456"));
        String url = PropertyUtil.getContextProperty("rx.login.url")+"";
        String data = jsonObject.toString();
        logger.info("访问登录的url："+url+"----数据："+data);
        String resultjson = HttpClientUtil.faceLogin(url, data);
        logger.info("访问登录的结果："+resultjson);
        JSONObject resultObject = JSONObject.fromObject(resultjson);
        logger.info("获取到的sessionId："+resultObject.get("session_id"));
        if(resultObject!=null && resultObject.get("session_id")!=null){
            String sesessionId = resultObject.get("session_id")+"";
            //获取faceId
            jsonObject = new JSONObject();
            jsonObject.put("picture_image_content_base64", "--query_base_64--");
            url = PropertyUtil.getContextProperty("rx.get.faceId")+"";
            data = jsonObject.toString().replaceAll("--query_base_64--", imageBase64);
            logger.info("获取faceId的url："+url+"-----数据："+data+"-----sessionId："+sesessionId);
            resultjson = HttpClientUtil.faceGetBySessionId(url, data, sesessionId);
            logger.info("获取faceId的结果："+resultjson);
            resultObject = JSONObject.fromObject(resultjson);
            logger.info("获取到的results："+resultObject.get("results"));
            if(resultObject!=null && resultObject.get("results")!=null){
                JSONArray arr = JSONArray.fromObject(resultObject.get("results"));
                if (arr!=null && arr.size()>0){
                    String faceId = JSONObject.fromObject(arr.get(0)).get("face_image_id")+"";
                    logger.info("获取faceId的具体值为："+faceId);
                    //获取1vN图像信息
                    jsonObject = new JSONObject();
                    JSONObject retrievalJsonObject = new JSONObject();
                    retrievalJsonObject.put("face_image_id", Long.valueOf(faceId));
                    JSONArray repository_idsArr = new JSONArray();
                    retrievalJsonObject.put("repository_ids", repository_idsArr);
                    retrievalJsonObject.put("threshold", 50d);
                    jsonObject.put("retrieval", retrievalJsonObject);
                    JSONArray fieldsArr = new JSONArray();
                    fieldsArr.add("face_image_id");
                    fieldsArr.add("timestamp");
                    fieldsArr.add("name");
                    fieldsArr.add("person_id");
                    fieldsArr.add("similarity");
                    jsonObject.put("fields", fieldsArr);
                    jsonObject.put("condition", "{}");
                    JSONObject orderJsonObject = new JSONObject();
                    orderJsonObject.put("similarity", -1);
                    jsonObject.put("order", orderJsonObject);
                    jsonObject.put("start", 0);
                    jsonObject.put("limit", 100);
                    url = PropertyUtil.getContextProperty("rx.1vN.url")+"";
                    logger.info("拼接查询1vN图像数据的json参数："+jsonObject.toString()+"------url："+url);
                    resultjson = HttpClientUtil.faceGetBySessionId(url, jsonObject.toString(), sesessionId);
                    logger.info("获取1vN图像数据结果："+resultjson);
                    resultObject = JSONObject.fromObject(resultjson);
                    arr = JSONArray.fromObject(resultObject.get("results"));
                    logger.info("最终获取结果：\n");
                    if (arr!=null && arr.size()>0){
                        for (int i = 0; i < arr.size(); i++) {
                            JSONObject result = JSONObject.fromObject(arr.get(i));
                            logger.info("          姓名："+result.get("name")+"；身份证号："+result.get("person_id")+"；" +
                                    "相似度："+new DecimalFormat("######0.00").format(Double.valueOf(result.get("similarity")+"")));
                        }
                    }
                }
            }
        }
    }
}
