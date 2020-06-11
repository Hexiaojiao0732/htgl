package com.zhixin.rd.memory.web.controller.shouye;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.memory.web.entity.GxzEntity;
import com.zhixin.rd.memory.web.entity.RwEntity;
import com.zhixin.rd.memory.web.entity.RwGxRwEntity;
import com.zhixin.rd.memory.web.entity.SySzEntity;
import com.zhixin.rd.memory.web.service.shouye.IShouYeService;

@Controller
@RequestMapping(value = "/memory/shouye")
public class ShouYeController {
	@Autowired
	private IShouYeService shouYeService;
	
	@RequestMapping(value = "/queryList")
	@ResponseBody
	public MessageEntity queryList() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<SySzEntity> list = shouYeService.queryList();
		System.err.println("id=======" + list);
		try {
			map.put("result", list);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}
	
	@RequestMapping(value = "/querySpTj")
	@ResponseBody
	public MessageEntity queryListSp() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<SySzEntity> list = shouYeService.querySpTj();
		System.err.println("id=======" + list);
		try {
			map.put("result", list);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}
	
	@RequestMapping(value = "/editShouYe")
	@ResponseBody
	public MessageEntity editShouYe(@RequestBody SySzEntity entity) {
		System.err.println(entity);
		try {
			this.shouYeService.updateShouYe(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/deleteSpTj")
	@ResponseBody
	public MessageEntity deleteSpTj(@RequestParam Long id) {
		System.err.println(id);
		try {
			this.shouYeService.deleteSpTj(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/sptjAdd")
	@ResponseBody
	public MessageEntity addZt(@RequestBody SySzEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		try {
			entity.setLx("sptj");
			String  xh =shouYeService.queryBigBz();
			//获取最大的序号
			System.err.println("---===xh=---="+xh);
			entity.setBz(String.valueOf(Integer.parseInt(xh==null?"0":xh)+1));
			shouYeService.insertSptj(entity);
		} catch (Exception e) {
		System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	//置顶
	@RequestMapping(value = "/zdSpTj")
	@ResponseBody
	public MessageEntity zdSpTj(@RequestParam Long id) {
		System.err.println(id);
		SySzEntity entity = new  SySzEntity();
		try {
	//获取最大的序号
	String  xh =shouYeService.queryBigBz();
	System.err.println("---===xh=---="+xh);
	entity.setId(id);
	entity.setBz(String.valueOf(Integer.parseInt(xh)+1));
	System.err.println(entity);
			this.shouYeService.zdSpTj(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
}
