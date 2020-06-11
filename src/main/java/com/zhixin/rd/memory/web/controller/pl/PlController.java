package com.zhixin.rd.memory.web.controller.pl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.memory.web.entity.PlEntity;
import com.zhixin.rd.memory.web.service.pl.IPlService;
import com.zhixin.rd.rkjc.web.common.ControllerTool;

@Controller
@RequestMapping(value = "/memory/pl")
public class PlController {
	@Autowired
	private IPlService plService;
	
	@RequestMapping(value = "/selectPl")
	@ResponseBody
	public Map<String, Object> selectPl(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-=-"+param);
		Map<String, Object> map = ControllerTool.mapFilter(param);
//		Map<String,Object> map  = new  HashMap<String,Object>();
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		System.err.println("--==---map---===-"+map);
		List<PlEntity> list = plService.queryAllPl(map);
		int count=plService.countPl(map);
		System.out.println("---==-1--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	
	@RequestMapping(value = "/deletePl")
	@ResponseBody
	public MessageEntity deletePl(@RequestParam Long id) {
		try {
			this.plService.deletePlById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/shPl")
	@ResponseBody
	public MessageEntity shPl(@RequestParam Long id) {
		try {
			this.plService.shPlById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("sh failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("sh success!");
	}
	@RequestMapping(value = "/cancelShPl")
	@ResponseBody
	public MessageEntity cancelShPl(@RequestParam Long id) {
		try {
			this.plService.cancelShPlById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("sh failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("sh success!");
	}

}
