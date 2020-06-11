package com.zhixin.rd.memory.web.controller.lbt;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.memory.web.entity.GxzEntity;
import com.zhixin.rd.memory.web.entity.JlEntity;
import com.zhixin.rd.memory.web.entity.LbtEntity;
import com.zhixin.rd.memory.web.service.lbt.ILbtService;
import com.zhixin.rd.rkjc.web.common.ControllerTool;

@Controller
@RequestMapping(value = "/memory/lbt")
public class LbtController {

	Logger logger = LoggerFactory.getLogger(LbtController.class);

	@Autowired
	private ILbtService lbtService;
	
	@RequestMapping(value = "/selectLbt")
	@ResponseBody
	public Map<String, Object> selectPl(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-=-"+param);
		Map<String, Object> map = ControllerTool.mapFilter(param);
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		System.err.println("--==---map---===-"+map);
		List<LbtEntity> list = lbtService.queryLbt(map);
		int count=lbtService.countLbt(map);
		System.out.println("---==--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	
	@RequestMapping(value = "/addLbt")
	@ResponseBody
	public MessageEntity addLbt(@RequestBody LbtEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		try {
			lbtService.insertLbt(entity);
			
		} catch (Exception e) {
		System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	
	@RequestMapping(value = "/deleteLbt")
	@ResponseBody
	public MessageEntity deleteJl(@RequestParam Long id) {
		try {
			this.lbtService.deleteLbtById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/editLbt")
	@ResponseBody
	public MessageEntity editWjdc(@RequestBody LbtEntity entity) {
		try {
			this.lbtService.updateLbt(entity);
		} catch (Exception e) {
			logger.info(e.toString());
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
}
