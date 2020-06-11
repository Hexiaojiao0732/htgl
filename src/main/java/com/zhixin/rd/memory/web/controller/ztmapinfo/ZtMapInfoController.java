package com.zhixin.rd.memory.web.controller.ztmapinfo;

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
import com.zhixin.rd.memory.web.entity.CbwEntity;
import com.zhixin.rd.memory.web.entity.DsjEntity;
import com.zhixin.rd.memory.web.entity.ZtMapInfoEntity;
import com.zhixin.rd.memory.web.service.ztmapinfo.IZtMapInfoService;

@Controller
@RequestMapping(value="/memory/ztmapinfo")
public class ZtMapInfoController {
	@Autowired
	private IZtMapInfoService ztMapInfoService;
	
	@RequestMapping(value = "/selectAllList")
	@ResponseBody
	public Map<String, Object> selectWjdcList(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-1111=-"+param);
		Map<String,Object> map  = new  HashMap<String,Object>();
//		{sort=id, order=asc, page=1, rows=10}
//		{sort=id, order=asc, page=2, rows=10}
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int id =Integer.valueOf((String)param.get("id")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		map.put("id", id);
		List<ZtMapInfoEntity> list = ztMapInfoService.selectAllList(map);
		int count=ztMapInfoService.count(map);
		System.out.println("---==-1--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	
	@RequestMapping(value = "/ztMapInfoAdd")
	@ResponseBody
	public MessageEntity addZt(@RequestBody ZtMapInfoEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		try {
			ztMapInfoService.insertZtMapInfo(entity);
		} catch (Exception e) {
		System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	
	@RequestMapping(value = "/deleteZtMapInfo")
	@ResponseBody
	public MessageEntity deleteZtMapInfo(@RequestParam Long id) {
		try {
			this.ztMapInfoService.deleteZtMapInfo(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
}
