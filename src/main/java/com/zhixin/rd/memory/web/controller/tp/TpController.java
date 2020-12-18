package com.zhixin.rd.memory.web.controller.tp;

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
import com.zhixin.rd.memory.web.entity.TpEntity;
import com.zhixin.rd.memory.web.service.tp.ITpService;
import com.zhixin.rd.memory.web.util.IpUtils;

@Controller
@RequestMapping(value = "/memory/tp")
public class TpController {

	@Autowired
	private ITpService tpService;
	
	@RequestMapping(value = "/addTp")
	@ResponseBody
	public Map<String, Object> addTp(@RequestParam String xmId, HttpServletRequest request)
			throws ParseException {
		try {
			TpEntity entity = new TpEntity();
			entity.setXmId(xmId);
			entity.setIp(IpUtils.getIpAddress(request));
			tpService.insertTp(entity);
		} catch (Exception e) {
			System.out.println(e);
		}
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("xmId", xmId);
		int num = tpService.countTplist(param);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("num", num);
		return result;
	}
	
	@RequestMapping(value = "/selectTpList")
	@ResponseBody
	public Map<String, Object> selectTpList(HttpServletRequest request) throws Exception {
		System.out.println("ip:"+IpUtils.getIp(request));
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("ip", IpUtils.getIpAddress(request));
		List<TpEntity> list = tpService.queryTpList(param);
		int count=list.size();
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	
	@RequestMapping(value = "/selectXmTpNum")
	@ResponseBody
	public Map<String, Object> selectXmTpNum(@RequestParam String xmId, HttpServletRequest request) throws Exception {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("xmId", xmId);
		int num = tpService.countTplist(param);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("num", num);
		return result;
	}
}
