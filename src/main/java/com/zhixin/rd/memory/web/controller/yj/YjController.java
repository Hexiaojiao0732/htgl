package com.zhixin.rd.memory.web.controller.yj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhixin.rd.memory.web.entity.SyYjEntity;
import com.zhixin.rd.memory.web.entity.WjdcEntity;
import com.zhixin.rd.memory.web.service.yj.IYjService;


@Controller
@RequestMapping(value = "/memory/yj")
public class YjController {
	@Autowired
	private IYjService yjService;
	@RequestMapping(value = "/selectYjList")
	@ResponseBody
	public Map<String, Object> selectYjList(@RequestParam Map<String,Object> param) throws Exception {
		System.out.println("---==---=-=-=-=-=-"+param);
		Map<String, Object> map = new HashMap<String, Object>();
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		List<SyYjEntity> list = yjService.queryAllYj(map);
		int count=yjService.countYj();
		System.out.println("---==---=-=-=-=-=-"+count);
		System.out.println("---==---=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	
}
