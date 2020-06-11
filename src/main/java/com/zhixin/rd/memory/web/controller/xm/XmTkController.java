package com.zhixin.rd.memory.web.controller.xm;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.memory.web.entity.XmSpEntity;
import com.zhixin.rd.memory.web.entity.XmTkEntity;
import com.zhixin.rd.memory.web.service.xm.IXmService;
import com.zhixin.rd.rkjc.web.common.ControllerTool;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/memory/xm")
public class XmTkController {

	@Autowired
	IXmService xmService;

	@RequestMapping(value = "/addTkXm")
	@ResponseBody
	public MessageEntity addTkXm(@RequestBody XmTkEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		try {
			xmService.insertXmTk(entity);
		} catch (Exception e) {
			System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	
	@RequestMapping(value = "/selectXmTkList")
	@ResponseBody
	public Map<String, Object> selectXmTkList(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-=-"+param);
		Map<String, Object> map = ControllerTool.mapFilter(param);
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int ID =Integer.valueOf((String)param.get("id")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		map.put("ID", ID);
		List<XmTkEntity> list = xmService.queryAllXmTk(map);
		int count=xmService.countXmTk(map);
		System.out.println("---==-1--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	@RequestMapping(value = "/updateXmTk")
	@ResponseBody
	public MessageEntity updateXmTk(@RequestBody XmTkEntity entity) {
		System.err.println("2222223====="+entity +" ---===");
		try {
			this.xmService.updateXmTkById(entity);
		} catch (Exception e) {
			e.printStackTrace();
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}

	@RequestMapping(value = "/updateXmTkImg")
	@ResponseBody
	public MessageEntity updateXmTkImg(@RequestBody XmTkEntity entity) {
		System.err.println("2222223====="+entity +" ---===");
		try {
			this.xmService.updateXmTkImg(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/deleteXmTk")
	@ResponseBody
	public MessageEntity deleteXmTk(@RequestParam Long id) {
		try {
			this.xmService.deleteXmTk(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}

	@RequestMapping(value = "/getXmTkByXmId")
	@ResponseBody
	public List<XmTkEntity> getXmTkByXmId(@RequestParam Long xmId) {
		Map<String, Object> map = new HashMap<>();
		map.put("rows", 100);
		map.put("pageIndex", 0);
		map.put("ID", xmId);
		return xmService.queryAllXmTk(map);
	}
}
