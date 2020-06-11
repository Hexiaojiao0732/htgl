package com.zhixin.rd.memory.web.controller.zt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.sun.org.apache.bcel.internal.classfile.Field;
import com.zhixin.rd.memory.web.entity.HzhbEntity;
import com.zhixin.rd.memory.web.entity.ZtEntity;
import com.zhixin.rd.memory.web.service.zt.IZtService;
import com.zhixin.rd.rkjc.web.common.PropertyUtil;
import com.zhixin.rd.rkjc.web.entity.ZtryEntity;

@Controller
@RequestMapping(value = "/memory/zt")
public class ZtController {
	@Autowired
	private IZtService ztService;

	@RequestMapping(value = "/selectList")
	@ResponseBody
	public MessageEntity queryAllZt() throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<ZtEntity> list = ztService.queryAllZt();
		int count = ztService.countZt();
		System.err.println("list=======" + list);
		try {
			map.put("result", list);
			map.put("total", count);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}

	@RequestMapping(value = "/uploadImage")
	@ResponseBody
	public String uploadPicture1( HttpServletRequest request) throws Exception {
	   String saveUrl = "上传失败！";
	   CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
	   if (multipartResolver.isMultipart(request)) {
	      MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
	      MultipartFile file = multiRequest.getFile("file");
	      System.out.println("111111111111"+file.getOriginalFilename());
//	      int fileTyle = Integer.parseInt(multiRequest.getParameter("fileType"));
//	      String fileTyleName="C:"+File.separator+"Users"+File.separator+"12900"+File.separator+"Desktop"+File.separator+"test";
//	      switch (fileTyle){
//	         case 1 : fileTyleName = "video";break;//视频
//	         case 2 : fileTyleName = "audio";break;//音频
//	         case 3 : fileTyleName = "word";break;//文档
//	         case 4 : fileTyleName = "gallery";break;//图库
//	         case 5 : fileTyleName = "catalogue";break;//编目
//	      }
	      String fileTyleName=PropertyUtil.getContextProperty("tp.sava.path")+"";
	      String fileName = file.getOriginalFilename();
	      fileName = UUID.randomUUID()+fileName.substring(fileName.indexOf("."), fileName.length());
//	      String filePath = PropertyUtil.getContextProperty("tp.sava.path")+"/"+fileTyleName+"/";
	      String filePath =fileTyleName+File.separator;
	      if (!new File(filePath).exists()){
	         new File(filePath).mkdirs();
	      }
	      if(file!=null){
	         saveUrl = filePath+fileName;
	         System.err.println("--saveUrl-----"+saveUrl);
	         FileOutputStream os = new FileOutputStream(saveUrl);
	         InputStream in = file.getInputStream();
	         //以写字节的方式写文件
	         int b = 0;
	         while((b=in.read()) != -1){
	            os.write(b);
	         }
	         os.flush();
	         os.close();
	         in.close();
	      }
	   }
	   return saveUrl;
	}
	@RequestMapping(value = "/addZt")
	@ResponseBody
	public MessageEntity addZt(@RequestBody ZtEntity ztEntity, HttpServletRequest request) throws ParseException {
		try {
			System.err.println("===---------=========22222"+ztEntity);
			ztService.insertZt(ztEntity);

		} catch (Exception e) {
			System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}

	@RequestMapping(value = "/queryZtMc")
	@ResponseBody
	public List<ZtEntity> queryZtMc() throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<ZtEntity> list = ztService.queryZtMc();
		System.err.println("------list=======" + list);
		return list;
	}

	@RequestMapping(value = "/deleteZt")
	@ResponseBody
	public MessageEntity deleteHzhb(@RequestParam Long id) {
		try {
			this.ztService.deleteZtById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}

	@RequestMapping(value = "/queryZtById")
	@ResponseBody
	public MessageEntity queryHzhbById(@RequestParam Long id) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<ZtEntity> list = ztService.queryZtById(id);
		System.err.println("list=======" + list);
		try {
			map.put("result", list);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}

	@RequestMapping(value = "/editZt")
	@ResponseBody
	public MessageEntity editWjdc(@RequestBody ZtEntity entity) {
		System.err.println("111-----===" + entity);
		try {
			this.ztService.updateZt(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/editZtTp")
	@ResponseBody
	public MessageEntity editZtTp(@RequestBody ZtEntity entity,@RequestParam Long id) {
		System.err.println("111-----===" + entity);
		System.err.println("111-----===" + id);
		entity.setId(id);
		try {
			this.ztService.updateZtTp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
}
