package com.zhixin.rd.memory.web.controller.zaiti;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.memory.web.entity.SpEntity;
import com.zhixin.rd.memory.web.entity.YpEntity;
import com.zhixin.rd.memory.web.service.zaiti.IYpService;

@Controller
@RequestMapping(value = "/memory/yp")
public class YpController {
	@Autowired
	private IYpService ypService;
	
	@RequestMapping(value = "/selectYpList")
	@ResponseBody
	public Map<String, Object> selectYpList(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-=-"+param);
		Map<String,Object> map  = new  HashMap<String,Object>();
//		{sort=id, order=asc, page=1, rows=10}
//		{sort=id, order=asc, page=2, rows=10}
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
//		List<YpEntity> list = ypService.queryAllYp(map);
//		int count=ypService.countYp();
		int sfsh =Integer.valueOf((String)param.get("sfsh"));
		System.err.println("---===="+sfsh);
		List<YpEntity> list =null;
		int count=0;
		if(sfsh== 1 ){
			//全部
			list =ypService.queryAllYp(map);
			count = ypService.countYp();
		}if(sfsh==2){
			//未审核
			list = ypService.queryAllYp2(map);
			count = ypService.countYp2();
		}if(sfsh==3){
//			审核
			list = ypService.queryAllYp3(map);
			count = ypService.countYp3();
		}
		
		System.out.println("---==-1--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	@RequestMapping(value = "/addYp")
	@ResponseBody
	public MessageEntity addZt(@RequestBody YpEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		try {
			ypService.insertYp(entity);
		} catch (Exception e) {
		System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	
	@RequestMapping(value = "/deleteYp")
	@ResponseBody
	public MessageEntity deleteZd(@RequestParam Long id) {
		try {
			this.ypService.deleteYpById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/editYp")
	@ResponseBody
	public MessageEntity editWjdc(@RequestBody YpEntity entity) {
		System.err.println(entity);
		try {
			this.ypService.updateYp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/updateShYp")
	@ResponseBody
	public MessageEntity updateShYp(@RequestBody YpEntity entity) {
		System.err.println("2222223====="+entity +" ---===");
		try {
			this.ypService.updateShYp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping("/ypDownload")
	public void  download(@RequestParam String ypdz, HttpServletRequest request, HttpServletResponse response){
//		spdz = "C:/Users/12900/Desktop/101.docx";
		System.out.println("==="+ypdz);
		File tempFile = new File(ypdz.trim());
		String fileName = tempFile.getName();
		System.err.println("---"+fileName);
	   OutputStream out = null;
	   try {
	      response.setContentType("application/octet-stream");
	      response.setHeader("Content-Disposition",
	            "attachment; " + "filename=" + URLEncoder.encode(fileName, "UTF-8"));

	      out = response.getOutputStream();
	      out.write(FileUtils.readFileToByteArray(new File(ypdz)));
	      out.flush();

	   } catch (Exception e) {
//	      logger.error("",e);
	   } finally {
	      if(out != null){
	         try {
	            out.close();
	         } catch (IOException e) {
//	            logger.error("",e);
	         }
	      }
	   }
	}
	
}
