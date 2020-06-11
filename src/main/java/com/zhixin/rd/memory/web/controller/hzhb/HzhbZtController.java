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
import com.zhixin.rd.memory.web.entity.HzhbZtEntity;
import com.zhixin.rd.memory.web.entity.HzhbZtFrom;
import com.zhixin.rd.memory.web.service.hzhb.IHzhbService;
import com.zhixin.rd.rkjc.web.common.ControllerTool;

@Controller
@RequestMapping(value = "/memory/hzhbzt")
public class HzhbZtController {
	@Autowired
	private IHzhbService hzhbService;
	
	
	@RequestMapping(value = "/selectHzhbZtList")
	@ResponseBody
	public Map<String, Object> selectHzhbZtList(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-=-"+param);
//		Map<String,Object> map  = new  HashMap<String,Object>();
		Map<String, Object> map = ControllerTool.mapFilter(param);
//		{sort=id, order=asc, page=1, rows=10}
//		{sort=id, order=asc, page=2, rows=10}
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int ID =Integer.valueOf((String)param.get("ID")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		map.put("ID", ID);
		List<HzhbZtEntity> list = hzhbService.queryAllHzhbZt(map);
		int count=hzhbService.countHzhbZt(map);
		System.out.println("---==-1--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	@RequestMapping(value = "/updateSh")
	@ResponseBody
	public MessageEntity updateSh(@RequestBody HzhbZtEntity entity) {
		System.err.println("2222223====="+entity +" ---===");
		try {
			this.hzhbService.updateShZtById(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/deleteHzHbZt")
	@ResponseBody
	public MessageEntity deleteHzHbZt(@RequestParam Long id) {
		try {
			this.hzhbService.deleteHzHbZt(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
}
