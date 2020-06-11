package com.zhixin.rd.memory.web.controller.zx;

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
import org.w3c.dom.ls.LSInput;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.memory.web.entity.DsjEntity;
import com.zhixin.rd.memory.web.entity.ZxEntity;
import com.zhixin.rd.memory.web.service.zx.IZxService;

@Controller
@RequestMapping(value = "/memory/zx")
public class ZxController {
	@Autowired
	private IZxService zxService;
	@RequestMapping(value = "/selectZx")
	@ResponseBody
	public MessageEntity queryAllZt() throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<ZxEntity> list = zxService.queryAllZx();
		int count=zxService.countZx();
		System.err.println("list=======" + list);
		try {
			map.put("result", list);
			map.put("total", count);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}
	@RequestMapping(value = "/selectZxList")
	@ResponseBody
	public Map<String, Object> selectZxList(@RequestParam Map<String,Object> param) throws Exception {
		System.out.println("---==---=-=-=-=-=-"+param);
		Map<String, Object> map = new HashMap<String, Object>();
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		List<ZxEntity> list = zxService.queryAllZxList(map);
		int count=zxService.countZx();
		System.out.println("---==---=-=-=-=-=-"+count);
		System.out.println("---==---=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	
	@RequestMapping(value = "/addZx")
	@ResponseBody
	public MessageEntity addZx(@RequestBody ZxEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		try {
			zxService.insertZx(entity);
		} catch (Exception e) {
		System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	
	
	@RequestMapping(value = "/deleteZx")
	@ResponseBody
	public MessageEntity deleteZX(@RequestParam Long id) {
		try {
			this.zxService.deleteZxById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/editZx")
	@ResponseBody
	public MessageEntity editWjdc(@RequestBody ZxEntity entity) {
		System.err.println(entity);
		try {
			this.zxService.updateZx(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/editZxTp")
	@ResponseBody
	public MessageEntity editZxTp(@RequestBody ZxEntity entity) {
		System.err.println(entity);
		try {
			this.zxService.updateZxTp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
}
