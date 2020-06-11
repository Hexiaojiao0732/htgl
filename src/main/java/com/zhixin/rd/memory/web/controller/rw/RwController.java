package com.zhixin.rd.memory.web.controller.rw;

import java.text.ParseException;
import java.util.Arrays;
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

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.memory.web.entity.RwEntity;
import com.zhixin.rd.memory.web.entity.RwGxRwEntity;
import com.zhixin.rd.memory.web.entity.SySzEntity;
import com.zhixin.rd.memory.web.entity.ZtEntity;
import com.zhixin.rd.memory.web.service.rw.IRwService;

@Controller
@RequestMapping(value = "/memory/rw")
public class RwController {
	@Autowired
	private IRwService rwService;
	
	
	@RequestMapping(value = "/queryRwMc")
	@ResponseBody
	public List<RwEntity> queryRwMc() throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<RwEntity> list = rwService.queryRwMc();
		System.err.println("------list=======" + list);
		return list;
	}

	@RequestMapping(value = "/queryById")
	@ResponseBody
	public MessageEntity queryById(Long id) throws Exception {
		System.err.println("id===="+id);
		Map<String, Object> map = new HashMap<>();
		List<RwGxRwEntity> list = rwService.queryRwById(id);
		System.err.println("id=======" + list);
		try {
			map.put("result", list);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}
	@RequestMapping(value = "/queryRwById")
	@ResponseBody
	public MessageEntity queryRwById(Long id) throws Exception {
		System.err.println("id===="+id);
		Map<String, Object> map = new HashMap<>();
		List<RwEntity> list = rwService.queryById(id);
		System.err.println("id=======" + list);
		try {
			map.put("result", list);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}
	
	@RequestMapping(value = "/selectRw")
	@ResponseBody
	public MessageEntity queryAllRw() throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<RwEntity> list = rwService.queryAllRw();
		int count=rwService.countRw();
		System.err.println("list=======" + list);
		try {
			map.put("result", list);
			map.put("total", count);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}
	
	@RequestMapping(value = "/addRw")
	@ResponseBody
	public MessageEntity addZt(@RequestBody RwEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		long id=0;
		try {
			rwService.insertRw(entity);
			 id = entity.getId();
			System.err.println("id----=="+id);
		} catch (Exception e) {
		System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!").addCallbackData(id);
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!").addCallbackData(id);
	}
	@RequestMapping(value = "/addRwGx")
	@ResponseBody
	public MessageEntity addRwGx(@RequestParam(value = "ids[]")  String[] ids,@RequestParam(value = "id")  Long id, HttpServletRequest request)
			throws ParseException {
		System.err.println("id======="+id);
		RwGxRwEntity entity  =  new  RwGxRwEntity();
		String string = Arrays.toString(ids);
		System.err.println("2222----=="+string);
		for (int i = 0; i < ids.length; i++) {
			String aString= ids[i];
			System.err.println("2222222-----=="+aString);
			net.sf.json.JSONObject fromObject = net.sf.json.JSONObject.fromObject(aString);
			System.err.println(fromObject.get("xm"));
			entity.setSsrwId(id);
			entity.setXm((String)fromObject.get("xm"));
			entity.setXb((String)fromObject.get("xb"));
			entity.setNl(Integer.valueOf((String)fromObject.get("nl")));
			entity.setZp((String)fromObject.get("zp"));
			entity.setQtxm((String)fromObject.get("qtxm"));
			entity.setGb((String)fromObject.get("gb"));
			entity.setJg((String)fromObject.get("jg"));
			entity.setSzn((String)fromObject.get("szn"));
			entity.setNbbsh((String)fromObject.get("nbbsh"));
			entity.setLy((String)fromObject.get("ly"));
			entity.setPssj((String)fromObject.get("pssj"));
			entity.setPsdd((String)fromObject.get("psdd"));
			entity.setYrwgx((String)fromObject.get("yrwgx"));
			entity.setJj((String)fromObject.get("jj"));
			entity.setWzjj((String)fromObject.get("wzjj"));
			entity.setRwzp((String)fromObject.get("rwzp"));
			entity.setSf((String)fromObject.get("sf"));
			entity.setMz((String)fromObject.get("mz"));
			entity.setYz((String)fromObject.get("yz"));
			System.err.println("---==entity===---"+entity);
			rwService.insertRwGx(entity);
//			[id=0, ssrwId=2222, sf=老战士亲属, xb=3, yrwgx=测试, nl=2, yz=null, 
//					mz=蒙族, xm=333, pssj=2017-10-16 22:10:17, psdd=3, 
//					jj=33, wzjj=33, nbbsh=22, szn=222, gb=2222, 
//					qtxm=22, jg=2, ly=222, zp=2222, rwzp=C:\Users\12900\Desktop\ceshi.jpg]
		}
		
		
		try {
//			rwService.insertRw(entity);
		} catch (Exception e) {
			System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	
	@RequestMapping(value = "/addGx")
	@ResponseBody
	public MessageEntity addGx(@RequestParam(value = "ids[]")  String[] ids,@RequestParam(value = "id")  Long id, HttpServletRequest request)
			throws ParseException {
		System.err.println("id======="+id);
		RwGxRwEntity entity  =  new  RwGxRwEntity();
		String string = Arrays.toString(ids);
		System.err.println("2222----=="+string);
		for (int i = 0; i < ids.length; i++) {
			String aString= ids[i];
			if(aString!=null && !aString.isEmpty()){
				net.sf.json.JSONObject fromObject = net.sf.json.JSONObject.fromObject(aString);
				System.err.println(fromObject.get("xm"));
				entity.setSsrwId(id);
				entity.setXm((String)fromObject.get("xm"));
				entity.setXb((String)fromObject.get("xb"));
				entity.setNl(Integer.valueOf((fromObject.get("nl")!=null && !fromObject.get("nl").toString().isEmpty())?fromObject.get("nl").toString():"0"));
				entity.setZp((String)fromObject.get("zp"));
				entity.setQtxm((String)fromObject.get("qtxm"));
				entity.setGb((String)fromObject.get("gb"));
				entity.setJg((String)fromObject.get("jg"));
				entity.setSzn((String)fromObject.get("szn"));
				entity.setNbbsh((String)fromObject.get("nbbsh"));
				entity.setLy((String)fromObject.get("ly"));
				entity.setPssj((String)fromObject.get("pssj"));
				entity.setPsdd((String)fromObject.get("psdd"));
				entity.setYrwgx((String)fromObject.get("yrwgx"));
				entity.setJj((String)fromObject.get("jj"));
				entity.setWzjj((String)fromObject.get("wzjj"));
				entity.setRwzp((String)fromObject.get("rwzp"));
				entity.setSf((String)fromObject.get("sf"));
				entity.setMz((String)fromObject.get("mz"));
				entity.setYz((String)fromObject.get("yz"));
				System.err.println("---==entity===---"+entity);
				rwService.insertRwGx(entity);
			}
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	/**
	 * 修改
	 * @param entity
	 * @return
	 */
	@RequestMapping(value = "/editRw")
	@ResponseBody
	public MessageEntity editRw(@RequestBody RwEntity entity) {
		System.err.println(entity);
		try {
			this.rwService.updateRw(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/editRwTp")
	@ResponseBody
	public MessageEntity editRwTp(@RequestBody RwEntity entity,@RequestParam Long id) {
		System.err.println("111-----===" + entity);
		System.err.println("111-----===" + id);
		entity.setId(id);
		try {
			this.rwService.updateRwTp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/deleteRw")
	@ResponseBody
	public MessageEntity deleteZd(@RequestParam Long id) {
		try {
			this.rwService.deleteRwById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/deleteRwgx")
	@ResponseBody
	public MessageEntity deleteRwgx(@RequestParam Long id) {
		try {
			this.rwService.deleteRwgxById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
}
