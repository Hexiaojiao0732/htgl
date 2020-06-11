package com.zhixin.rd.memory.web.controller.xm;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.XmEntity;
import com.zhixin.rd.memory.web.entity.XmTkEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.memory.web.entity.HzhbZtEntity;
import com.zhixin.rd.memory.web.entity.XmSpEntity;
import com.zhixin.rd.memory.web.service.xm.IXmService;
import com.zhixin.rd.rkjc.web.common.ControllerTool;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/memory/xm")
public class XmSpController {

	@Autowired
	IXmService xmService;

	@RequestMapping(value = "/addSpXm")
	@ResponseBody
	public MessageEntity addSpXm(@RequestBody XmSpEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		try {
			xmService.insertXmSp(entity);
		} catch (Exception e) {
			System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	
	@RequestMapping(value = "/selectXmSpList")
	@ResponseBody
	public Map<String, Object> selectXmSpList(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-=-"+param);
		Map<String, Object> map = ControllerTool.mapFilter(param);
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int ID =Integer.valueOf((String)param.get("id")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		map.put("ID", ID);
		List<XmSpEntity> list = xmService.queryAllXmSp(map);
		int count=xmService.countXmSp(map);
		System.out.println("---==-1--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	@RequestMapping(value = "/updateXmSp")
	@ResponseBody
	public MessageEntity updateXmSp(@RequestBody XmSpEntity entity) {
		System.err.println("2222223====="+entity +" ---===");
		try {
			this.xmService.updateXmSpById(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}

	@RequestMapping(value = "/updateXmSpImg")
	@ResponseBody
	public MessageEntity updateXmSpImg(@RequestBody XmSpEntity entity) {
		System.err.println("2222223====="+entity +" ---===");
		try {
			this.xmService.updateXmSpImg(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/deleteXmSp")
	@ResponseBody
	public MessageEntity deleteXmSp(@RequestParam Long id) {
		try {
			this.xmService.deleteXmSp(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}

	@RequestMapping(value = "/getXmSpByXmId")
	@ResponseBody
	public List<XmSpEntity> getXmSpByXmId(@RequestParam Long xmId) {
		Map<String, Object> map = new HashMap<>();
		map.put("rows", 100);
		map.put("pageIndex", 0);
		map.put("ID", xmId);
		return xmService.queryAllXmSp(map);
	}

	@RequestMapping(value = "/getXmSpById")
	@ResponseBody
	public XmSpEntity getXmSpById(@RequestParam Long id) {
		return xmService.getXmSpById(id);
	}
}
