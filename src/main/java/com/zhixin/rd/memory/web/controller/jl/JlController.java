package com.zhixin.rd.memory.web.controller.jl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
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
import com.zhixin.rd.memory.web.entity.DmDzEntity;
import com.zhixin.rd.memory.web.entity.JlEntity;
import com.zhixin.rd.memory.web.entity.ZtEntity;
import com.zhixin.rd.memory.web.service.jl.IJlService;
import com.zhixin.rd.memory.web.service.zt.IZtService;

@Controller
@RequestMapping(value = "/memory/jl")
public class JlController {
	@Autowired
	private IJlService jlService;
	
	@RequestMapping(value = "/queryJlMc")
	@ResponseBody
	public List<JlEntity> queryJlMc() throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<JlEntity> list = jlService.queryJlMc();
		System.err.println("------list=======" + list);
		return list;
	}

	@RequestMapping(value = "/selectJl")
	@ResponseBody
	public MessageEntity queryAlljl() throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<JlEntity> list = jlService.queryAlljl();
		int count=jlService.countJl();
		System.err.println("list=======" + list);
		try {
			map.put("result", list);
			map.put("total", count);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}
	
//	
	@RequestMapping(value = "/addJl")
	@ResponseBody
	public MessageEntity addZt(@RequestBody JlEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		try {
//			JlEntity jlEntity =  new JlEntity();
//			System.err.println("1----=="+jlEntity);
//			jlEntity.setSsztId(Integer.valueOf((String)param.get("ssztId")));
//			jlEntity.setDyC(Integer.valueOf((String)param.get("dyC")));
//			jlEntity.setDyS(Integer.valueOf((String)param.get("dyS")));
//			jlEntity.setDyX(Integer.valueOf((String)param.get("dyX")));
//			jlEntity.setFl((String)param.get("fl"));
//			jlEntity.setJj((String)param.get("jj"));
//			jlEntity.setJltp((String)param.get("jltp"));
//			jlEntity.setMc((String)param.get("mc"));
//			jlEntity.setPsdd((String)param.get("psdd"));
//			jlEntity.setPssj((String)param.get("pssj"));
//			jlEntity.setSc(Integer.valueOf((String)param.get("sc")));
//			jlEntity.setWzjj((String)param.get("wzjj"));
//			jlEntity.setYz((String)param.get("yz"));
//			jlEntity.setZt((String)param.get("zt"));
//			System.err.println("jlEntity===============-----"+jlEntity);
			jlService.insertJl(entity);
			
		} catch (Exception e) {
		System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	@RequestMapping(value = "/deleteJl")
	@ResponseBody
	public MessageEntity deleteJl(@RequestParam Long id) {
		try {
			this.jlService.deleteJlById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/queryJlById")
	@ResponseBody
	public MessageEntity queryHzhbById(@RequestParam Long id) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<JlEntity> list =jlService.queryJlById(id);
		System.err.println("list=======" + list);
		try {
			map.put("result", list);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}

	@RequestMapping(value = "/editJl")
	@ResponseBody
	public MessageEntity editJl(@RequestBody JlEntity entity) {
		System.err.println("111-----===" + entity);
		try {
			this.jlService.updateJl(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	/**
	 * 修改图片
	 * @param entity
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/editJlTp")
	@ResponseBody
	public MessageEntity editZtTp(@RequestBody JlEntity entity,@RequestParam Long id) {
		System.err.println("111-----===" + entity);
		System.err.println("111-----===" + id);
		entity.setId(id);
		try {
			this.jlService.updateJlTp(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	 @RequestMapping(value = "/dzList")
	    @ResponseBody
	    public List<DmDzEntity> dzList(@RequestParam Map<String, Object> params) {
		 System.err.println("param"+params);
		 System.err.println("param111111"+jlService.list(params));
	        return jlService.list(params);
	    }
}
