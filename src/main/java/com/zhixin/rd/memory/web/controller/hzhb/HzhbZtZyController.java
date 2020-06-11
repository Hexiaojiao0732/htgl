package com.zhixin.rd.memory.web.controller.hzhb;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
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
import com.zhixin.rd.memory.web.entity.HzhbZtEntity;
import com.zhixin.rd.memory.web.entity.HzhbZtZyEntity;
import com.zhixin.rd.memory.web.service.hzhb.IHzhbService;
import com.zhixin.rd.rkjc.web.common.ControllerTool;

@Controller
@RequestMapping(value = "/memory/hzhbztzy")
public class HzhbZtZyController {
	@Autowired
	private IHzhbService hzhbService;
	
	
	@RequestMapping(value = "/selectHzhbZtZyList")
	@ResponseBody
	public Map<String, Object> selectHzhbZtZyList(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-=-"+param);
//		Map<String,Object> map  = new  HashMap<String,Object>();
		Map<String, Object> map = ControllerTool.mapFilter(param);
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int ID =Integer.valueOf((String)param.get("ID")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		map.put("ID", ID);
		List<HzhbZtZyEntity> list = hzhbService.queryAllHzhbZtZy(map);
		int count=hzhbService.countHzhbZtZy(map);
		System.out.println("---==-1--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	
	@RequestMapping(value = "/updateShZy")
	@ResponseBody
	public MessageEntity updateShZy(@RequestBody HzhbZtZyEntity entity) {
		System.err.println("2222223====="+entity +" ---===");
		try {
			this.hzhbService.updateShZyById(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/updateShZy1")
	@ResponseBody
	public MessageEntity updateShZy1(@RequestBody HzhbZtZyEntity entity) {
		System.err.println("2222223====="+entity +" ---===");
		try {
			this.hzhbService.updateShZy(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/deleteHzHbZtZy")
	@ResponseBody
	public MessageEntity deleteHzHbZtZy(@RequestParam Long id) {
		try {
			this.hzhbService.deleteHzHbZtZy(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping("/hzhbztzyDownload")
	public void  download(@RequestParam String zydz, HttpServletRequest request, HttpServletResponse response){
//		spdz = "C:/Users/12900/Desktop/101.docx";
		System.out.println("==="+zydz);
		File tempFile = new File(zydz.trim());
		String fileName = tempFile.getName();
		System.err.println("---"+fileName);
	   OutputStream out = null;
	   try {
	      response.setContentType("application/octet-stream");
	      response.setHeader("Content-Disposition",
	            "attachment; " + "filename=" + URLEncoder.encode(fileName, "UTF-8"));

	      out = response.getOutputStream();
	      out.write(FileUtils.readFileToByteArray(new File(zydz)));
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
