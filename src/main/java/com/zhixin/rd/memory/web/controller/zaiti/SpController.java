package com.zhixin.rd.memory.web.controller.zaiti;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.internal.formatter.comment.MultiCommentLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.zhixin.rd.memory.web.dao.zaiti.ISpMapper;
import com.zhixin.rd.memory.web.entity.HzhbZtZyEntity;
import com.zhixin.rd.memory.web.entity.SpEntity;
import com.zhixin.rd.memory.web.entity.ZtEntity;
import com.zhixin.rd.memory.web.service.zaiti.ISpService;
import com.zhixin.rd.rkjc.web.common.PropertyUtil;

@Controller
@RequestMapping(value = "/memory/sp")
public class SpController {
	@Autowired
	private ISpService spService;

	@RequestMapping(value = "/selectSpList")
	@ResponseBody
	public Map<String, Object> selectSpList(@RequestParam Map<String, Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-=-" + param);
		Map<String, Object> map = new HashMap<String, Object>();
		// {sort=id, order=asc, page=1, rows=10}
		// {sort=id, order=asc, page=2, rows=10}
		int page = Integer.valueOf((String) param.get("page"));
		int row = Integer.valueOf((String) param.get("rows"));
		int pageIndex = (page - 1) * row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		int sfsh =Integer.valueOf((String)param.get("sfsh"));
		List<SpEntity> list =null;
		int count=0;
		if(sfsh== 1 ){
			//全部
			list =spService.queryAllSp(map);
			count = spService.countSp();
		}if(sfsh==2){
			//未审核
			list = spService.queryAllSp2(map);
			count = spService.countSp2();
		}if(sfsh==3){
			//审核
			list = spService.queryAllSp3(map);
			count = spService.countSp3();
			
		}
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}

	@RequestMapping(value = "/selectSpList1")
	@ResponseBody
	public List<SpEntity> selectSpList1() throws Exception {
		List<SpEntity> list =list = spService.querySpList();
		return list;
	}

	@RequestMapping(value = "/addSp")
	@ResponseBody
	public MessageEntity addZt(@RequestBody SpEntity entity, HttpServletRequest request) throws ParseException {
		try {
			spService.insertSp(entity);
		} catch (Exception e) {
			System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}

	@RequestMapping(value = "/deleteSp")
	@ResponseBody
	public MessageEntity deleteZd(@RequestParam Long id) {
		try {
			this.spService.deleteSpById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}

	@RequestMapping(value = "/editSp")
	@ResponseBody
	public MessageEntity editWjdc(@RequestBody SpEntity entity) {
		System.err.println(entity);
		try {
			this.spService.updateSp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}

	@RequestMapping(value = "/updateShSp")
	@ResponseBody
	public MessageEntity updateShSp(@RequestBody SpEntity entity) {
		System.err.println("2222223=====" + entity + " ---===");
		try {
			this.spService.updateShSp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}

	@RequestMapping(value = "/editSpTp")
	@ResponseBody
	public MessageEntity editSpTp(@RequestBody SpEntity entity,@RequestParam Long id) {
		entity.setId(id);
		try {
			this.spService.updateSpTp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/")
	@ResponseBody
	public MessageEntity downloadSp(@RequestParam String spdz) {
		System.err.println("2222223=====" + spdz + " ---===");
		String saveUrl = "上传失败！";
		try {
			File file = new File(spdz);
			String fileTyleName = "C:" + File.separator + "Users" + File.separator + "12900" + File.separator
					+ "Desktop" + File.separator + "test";
			File tempFile = new File(spdz.trim());
			String fileName = tempFile.getName();
			fileName = UUID.randomUUID() + fileName.substring(fileName.indexOf("."), fileName.length());
			String filePath = fileTyleName + File.separator;
			if (!new File(filePath).exists()) {
				new File(filePath).mkdirs();
			}
			if (file != null) {
				saveUrl = filePath + fileName;
				System.err.println("--saveUrl-----" + saveUrl);
				FileOutputStream os = new FileOutputStream(saveUrl);
				FileInputStream in =new  FileInputStream(file);
				// 以写字节的方式写文件
				byte[] by = new byte[1024];
				int b = 0;
				while ((b = in.read()) != -1) {
					os.write(by, 0, b);
				}
				os.flush();
				os.close();
				in.close();
			}

		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	
	@RequestMapping("/spDownload")
	public void  download(@RequestParam String spdz, HttpServletRequest request, HttpServletResponse response){
//		spdz = "C:/Users/12900/Desktop/101.docx";
		File tempFile = new File(spdz.trim());
		String fileName = tempFile.getName();
		System.err.println("---"+fileName);
	   OutputStream out = null;
	   try {
	      response.setContentType("application/octet-stream");
	      response.setHeader("Content-Disposition",
	            "attachment; " + "filename=" + URLEncoder.encode(fileName, "UTF-8"));

	      out = response.getOutputStream();
	      out.write(FileUtils.readFileToByteArray(new File(spdz)));
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
