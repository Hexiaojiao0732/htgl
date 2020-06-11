package com.zhixin.rd.memory.web.controller.dsj;

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
import com.zhixin.rd.memory.web.entity.DsjEntity;
import com.zhixin.rd.memory.web.service.dsj.IDsjService;

@Controller
@RequestMapping(value = "/memory/dsj")
public class DsjController {
	@Autowired
	private IDsjService dsjService;
	
	@RequestMapping(value = "/selectDsjList")
	@ResponseBody
	public Map<String, Object> selectWjdcList(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-=-"+param);
		Map<String,Object> map  = new  HashMap<String,Object>();
//		{sort=id, order=asc, page=1, rows=10}
//		{sort=id, order=asc, page=2, rows=10}
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		List<DsjEntity> list = dsjService.queryAllDsj(map);
		int count=dsjService.countDsj();
		System.out.println("---==-1--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	@RequestMapping(value = "/addDsj")
	@ResponseBody
	public MessageEntity addZt(@RequestBody DsjEntity entity, HttpServletRequest request)
			throws Exception {
		System.err.println("2----=="+entity);
		long id=0;
		try {
			dsjService.insertDsj(entity);
			System.err.println("id----=="+id);
		} catch (Exception e) {
		System.out.println(e);
		return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
	}
	return new MessageEntity().addCode(1).addIsError(false).addTitle("提醒").addContent("添加成功!");
	}
	
	@RequestMapping(value = "/deleteSj")
	@ResponseBody
	public MessageEntity deleteZd(@RequestParam Long id) {
		try {
			this.dsjService.deleteDsjById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/editSj")
	@ResponseBody
	public MessageEntity editWjdc(@RequestBody DsjEntity entity) {
		System.err.println(entity);
		try {
			this.dsjService.updateDsj(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/editSjTp")
	@ResponseBody
	public MessageEntity editsjtp(@RequestBody DsjEntity entity) {
		System.err.println(entity);
		try {
			this.dsjService.updateDsjTp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
}
