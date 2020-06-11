package com.zhixin.rd.memory.web.controller.cbw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhixin.rd.memory.web.entity.CbwEntity;
import com.zhixin.rd.memory.web.entity.DsjEntity;
import com.zhixin.rd.memory.web.service.cbw.ICbwService;

@Controller
@RequestMapping(value = "/memory/cbw")
public class CbwController {
	@Autowired
	private ICbwService cbwService;
	
	@RequestMapping(value = "/selectCbwList")
	@ResponseBody
	public Map<String, Object> selectWjdcList(@RequestParam Map<String,Object> param) throws Exception {
		System.err.println("---==---=-=-=-=-1111=-"+param);
		Map<String,Object> map  = new  HashMap<String,Object>();
//		{sort=id, order=asc, page=1, rows=10}
//		{sort=id, order=asc, page=2, rows=10}
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		List<CbwEntity> list = cbwService.queryAllCbw(map);
		int count=cbwService.countCbw();
		System.out.println("---==-1--=-=-=-=-=-"+count);
		System.out.println("---==--1-=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
}
