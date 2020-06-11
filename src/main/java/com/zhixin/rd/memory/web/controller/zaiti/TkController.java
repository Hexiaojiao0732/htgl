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
import com.zhixin.rd.memory.web.entity.TkEntity;
import com.zhixin.rd.memory.web.service.zaiti.ITkService;
import com.zhixin.rd.rkjc.web.common.ControllerTool;

@Controller
@RequestMapping(value = "/memory/tk")
public class TkController {
	@Autowired
	private ITkService tkService;
	
	@RequestMapping(value = "/selectTkList")
	@ResponseBody
	public Map<String, Object> selectTkList(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-=-"+param);
		Map<String, Object> map = ControllerTool.mapFilter(param);
//		Map<String,Object> map  = new  HashMap<String,Object>();
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		System.err.println("--==---map---===-"+map);
		List<TkEntity> list = tkService.queryAllTk(map);
		int count=tkService.countTk();
		System.out.println("---==-1--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	@RequestMapping(value = "/addtk")
	@ResponseBody
	public MessageEntity addTk(@RequestBody TkEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		try {
			tkService.insertTk(entity);
		} catch (Exception e) {
		System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	
	@RequestMapping(value = "/deleteTk")
	@ResponseBody
	public MessageEntity deleteTk(@RequestParam Long id) {
		try {
			this.tkService.deleteTkById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/editTk")
	@ResponseBody
	public MessageEntity editWjdc(@RequestBody TkEntity entity) {
		System.err.println(entity);
		try {
			this.tkService.updateTk(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/editTkTp")
	@ResponseBody
	public MessageEntity editTkTp(@RequestBody TkEntity entity) {
		System.err.println(entity);
		try {
			this.tkService.updateTkTp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/updateShTk")
	@ResponseBody
	public MessageEntity updateShTk(@RequestParam Long id) {
		try {
			this.tkService.updateTkById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	
	@RequestMapping("/tkDownload")
	public void  download(@RequestParam String tpdz, HttpServletRequest request, HttpServletResponse response){
//		spdz = "C:/Users/12900/Desktop/101.docx";
		System.out.println("==="+tpdz);
		File tempFile = new File(tpdz.trim());
		String fileName = tempFile.getName();
		System.err.println("---"+fileName);
	   OutputStream out = null;
	   try {
	      response.setContentType("application/octet-stream");
	      response.setHeader("Content-Disposition",
	            "attachment; " + "filename=" + URLEncoder.encode(fileName, "UTF-8"));

	      out = response.getOutputStream();
	      out.write(FileUtils.readFileToByteArray(new File(tpdz)));
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
