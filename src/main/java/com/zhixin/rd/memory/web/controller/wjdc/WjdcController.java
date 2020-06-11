package com.zhixin.rd.memory.web.controller.wjdc;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.rkjc.web.common.ControllerTool;
import com.zhixin.rd.memory.web.entity.WjdcEntity;
import com.zhixin.rd.memory.web.entity.ZtEntity;
import com.zhixin.rd.memory.web.service.wjdc.IWjdcService;

import net.sf.json.util.NewBeanInstanceStrategy;

@Controller
@RequestMapping(value = "/memory/wjdc")
public class WjdcController {
	@Autowired
	private IWjdcService wjdcService;
	
	@RequestMapping(value = "/selectWjdcList")
	@ResponseBody
	public Map<String, Object> selectWjdcList(@RequestParam Map<String,Object> param) throws Exception {
		System.out.println("---==---=-=-=-=-=-"+param);
		Map<String, Object> map = new HashMap<String, Object>();
		int page= Integer.valueOf((String)param.get("page")) ;
		int row =Integer.valueOf((String)param.get("rows")) ;
		int pageIndex= (page-1)*row;
		map.put("rows", row);
		map.put("pageIndex", pageIndex);
		List<WjdcEntity> list = wjdcService.queryAllWjdc(map);
		int count=wjdcService.countWjdc();
		System.out.println("---==---=-=-=-=-=-"+count);
		System.out.println("---==---=-=-=-=-=-"+list);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", count);
		result.put("rows", list);
		return result;
	}
	
	
	@RequestMapping(value = "/deleteWjdc")
	@ResponseBody
	public MessageEntity deleteZd(@RequestParam Long id) {
		try {
			this.wjdcService.deleteWjdcById(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/editWjdc")
	@ResponseBody
	public MessageEntity editWjdc(@RequestBody WjdcEntity entity) {
		System.err.println(entity);
		try {
			this.wjdcService.updateWjdc(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	/**
	 * 生成报表数据返回spring配置文件中进行数据整合形成下载文件
	 *
	 */
	@RequestMapping(value = "/exportExcel")
	public ModelAndView sysAllusersExcel(@RequestParam Map<String,Object> param,HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.err.println("进入查询！！！！！！！！！！！！！！！！"+param);
		String filename = new String("数据报表".getBytes(),"iso8859-1");
		response.setHeader("Content-Disposition","attachment;filename="+filename+".xls");
		Map<String, Object> map = ControllerTool.mapFilter(param);
//		Map<String, Object> map = new  HashMap<String, Object>();
//			String beginTime=request.getParameter("beginTime");
//			System.out.println(beginTime);
//			if(beginTime!=null &&!"".equals(beginTime)){
//				map.put("beginTime", beginTime);
//			}
//			String endtime=request.getParameter("endtime");
//			if(endtime!=null &&!"".equals(endtime)){
//				map.put("endtime", endtime);
//			}
//			String yhXm=request.getParameter("yhXm");
//			if(yhXm!=null &&!"".equals(yhXm)){
//				map.put("yhXm", yhXm);
//			}
//			String ajAjmc=request.getParameter("ajAjmc");
//			if(ajAjmc!=null &&!"".equals(ajAjmc)){
//				System.err.println("---personType---"+ajAjmc);
//				map.put("ajAjmc", ajAjmc);
//			}
//			String jzJzbh=request.getParameter("jzJzbh");
//			System.err.println(",-----personSex-----"+jzJzbh);
//			if(jzJzbh!=null &&!"".equals(jzJzbh)){
//				map.put("jzJzbh", jzJzbh);
//			}
//			String jzgMc=request.getParameter("jzgMc");
//			if(jzgMc!=null &&!"".equals(jzgMc)){
//				map.put("jzgMc", jzgMc);
//			}
//			String gmXsbh=request.getParameter("gmXsbh");
//			if(gmXsbh!=null &&!"".equals(gmXsbh)){
//				map.put("gmXsbh", gmXsbh);
//			}
//			String czlx = request.getParameter("z");
//			if(czlx!=null &&!"".equals(czlx)){
//				map.put("czlx", czlx);
//			}
//			String czsj=request.getParameter("czsj");
//			if(czsj!=null &&!"".equals(czsj)){
//				map.put("czsj", czsj);
//			}
//			String zplj=request.getParameter("zplj");
//			if(zplj!=null &&!"".equals(zplj)){
//				map.put("zplj", zplj);
//			}
//		List<ExportEntity> list = this.exportService.listother(map);
			System.err.println("---------------------------"+map);
		List<WjdcEntity> list = wjdcService.list(map);
		System.err.println("---------------------------"+list);
		if(list.size()>0 && list!=null ){
			System.err.println("---------------------------"+list.size());
			String strs = "下载成功";
			request.setAttribute("strs", strs);
			return new ModelAndView("reportView","list" ,list);
		}else{
			return null;
		}
	}
}
