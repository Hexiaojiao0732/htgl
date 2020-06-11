package com.zhixin.rd.memory.web.controller.hzhb;

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
import com.zhixin.rd.memory.web.entity.HzhbEntity;
import com.zhixin.rd.memory.web.entity.ZtEntity;
import com.zhixin.rd.memory.web.service.hzhb.IHzhbService;

@Controller
@RequestMapping(value = "/memory/hzhb")
public class HzhbController {
	@Autowired
	private IHzhbService hzhbService;
	
	@RequestMapping(value = "/addHzhb")
	@ResponseBody
	public MessageEntity addZt(@RequestBody HzhbEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		try {
			hzhbService.insertHzhb(entity);
		} catch (Exception e) {
		System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	
	@RequestMapping(value = "/selectListHzhb")
	@ResponseBody
	public MessageEntity queryAllHzhb() throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<HzhbEntity> list = hzhbService.queryAllHzhb();
		int count=hzhbService.countHzhb();
		System.err.println("list=======" + list);
		try {
			map.put("result", list);
			map.put("total", count);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}
	
	@RequestMapping(value = "/deleteHzhb")
	@ResponseBody
	public MessageEntity deleteHzhb(@RequestParam Long id) {
		try {
			this.hzhbService.deleteHzhbById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/queryHzhbById")
	@ResponseBody
	public MessageEntity queryHzhbById(@RequestParam Long id) throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<HzhbEntity> list = hzhbService.queryHzhbById(id);
		System.err.println("list=======" + list);
		try {
			map.put("result", list);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}
	@RequestMapping(value = "/editHzhb")
	@ResponseBody
	public MessageEntity editWjdc(@RequestBody HzhbEntity entity) {
		System.err.println("111-----==="+entity);
		try {
			this.hzhbService.updateHzhb(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/editHzhbTp")
	@ResponseBody
	public MessageEntity editZtTp(@RequestBody HzhbEntity entity,@RequestParam Long id) {
		System.err.println("111-----===" + entity);
		System.err.println("111-----===" + id);
		entity.setId(id);
		try {
			this.hzhbService.updateHzhbTp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
}
