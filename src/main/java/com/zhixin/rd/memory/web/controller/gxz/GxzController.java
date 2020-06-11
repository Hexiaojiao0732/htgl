package com.zhixin.rd.memory.web.controller.gxz;

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
import com.zhixin.rd.memory.web.service.gxz.IGxzService;

@Controller
@RequestMapping(value = "/memory/gxz")
public class GxzController {
	@Autowired
	private IGxzService gxzService;
	
	@RequestMapping(value = "/queryGxzMc")
	@ResponseBody
	public List<GxzEntity> queryGxzMc() throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<GxzEntity> list = gxzService.queryGxzMc();
		System.err.println("------list=======" + list);
		return list;
	}

	
	@RequestMapping(value = "/selectGxzList")
	@ResponseBody
	public Map<String, Object> selectGxzList(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-=-"+param);
		Map<String,Object> map  = new  HashMap<String,Object>();
//		{sort=id, order=asc, page=1, rows=10}
//		{sort=id, order=asc, page=2, rows=10}
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		List<GxzEntity> list = gxzService.queryAllGxz(map);
		int count=gxzService.countGxz();
		System.out.println("---==-1--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	@RequestMapping(value = "/addGxz")
	@ResponseBody
	public MessageEntity addZt(@RequestBody GxzEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		long id=0;
		try {
			gxzService.insertGxz(entity);
			System.err.println("id----=="+id);
		} catch (Exception e) {
		System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!").addCallbackData(id);
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!").addCallbackData(id);
	}
	
	@RequestMapping(value = "/deleteGxz")
	@ResponseBody
	public MessageEntity deleteZd(@RequestParam Long id) {
		try {
			this.gxzService.deleteGxzById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/editGxz")
	@ResponseBody
	public MessageEntity editWjdc(@RequestBody GxzEntity entity) {
		System.err.println(entity);
		try {
			this.gxzService.updateGxz(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/editGxzTp")
	@ResponseBody
	public MessageEntity editGxzTp(@RequestBody GxzEntity entity) {
		System.err.println(entity);
		try {
			this.gxzService.updateGxzTp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
}
