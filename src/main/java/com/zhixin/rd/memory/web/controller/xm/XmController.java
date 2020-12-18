package com.zhixin.rd.memory.web.controller.xm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLDecoder;
import java.text.ParseException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.ideal.rd.web.framework.entity.MessageEntity;
import com.zhixin.rd.memory.web.entity.XmEntity;
import com.zhixin.rd.memory.web.service.tp.ITpService;
import com.zhixin.rd.memory.web.service.tp.TpServiceImpl;
import com.zhixin.rd.memory.web.service.xm.IXmService;
import com.zhixin.rd.rkjc.web.common.PropertyUtil;

@Controller
@RequestMapping(value = "/memory/xm")
public class XmController {

	@Autowired
	IXmService xmService;
	@Autowired
	ITpService tpService;
	
	
	@RequestMapping(value = "/addXm")
	@ResponseBody
	public MessageEntity addXm(@RequestBody XmEntity entity, HttpServletRequest request)
			throws ParseException {
		System.err.println("2----=="+entity);
		try {
			xmService.insertXm(entity);
		} catch (Exception e) {
		System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("添加失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("添加成功!");
	}
	
	@RequestMapping(value = "/selectXmList")
	@ResponseBody
	public Map<String, Object> queryAllXm(@RequestParam Map<String, Object> param) throws Exception {
		if (param.get("page") !=null && param.get("rows")!=null) {
			int page = Integer.valueOf((String) param.get("page"));
			int row = Integer.valueOf((String) param.get("rows"));
			int pageIndex = (page - 1) * row;
			param.put("rows", row);
			param.put("pageIndex", pageIndex);
		}
		if(param.get("qy")!=null){
			String qy = URLDecoder.decode(param.get("qy")+"", "UTF-8");
			param.put("ssqy", qy);
		}
		if(param.get("lx")!=null){
			param.put("xmlb", param.get("lx"));
		}
		if (param.get("isAll")!=null) {
			param.put("isAll", param.get("isAll"));
		}
		Map<String, Object> map = new HashMap<>();
		List<XmEntity> list = xmService.queryAllXm(param);
		int count=xmService.countXm(param);
		if (param.get("pc") != null && param.get("pc").equals("3")) {
			List<Map<String, Object>> tpXmList = tpService.selectTpXm();
			if (!tpXmList.isEmpty()) {
				Map<String, Object> tpXmMap = new HashMap<String, Object>();
				for (Map<String, Object> tpxm : tpXmList) {
					tpXmMap.put(tpxm.get("xmId").toString(), tpxm.get("count"));
				}
				for (XmEntity xm : list) {
					if (tpXmMap.get(xm.getId().toString()) != null) {
						xm.setTpCount(Integer.parseInt(tpXmMap.get(xm.getId().toString()).toString()));
					}
				}
				
				Collections.sort(list, new Comparator<XmEntity>() {
					@Override
					public int compare(XmEntity u1, XmEntity u2) {
						int diff = u2.getTpCount() - u1.getTpCount();
						if (diff > 0) {
							return 1;
						} else if (diff < 0) {
							return -1;
						}
						return 0;
					}
				});
			}
		}
		try {
			map.put("rows", list);
			map.put("total", count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	@RequestMapping(value = "/deleteXm")
	@ResponseBody
	public MessageEntity deleteXm(@RequestParam Long id) {
		try {
			this.xmService.deleteXm(id);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	@RequestMapping(value = "/queryXmById")
	@ResponseBody
	public MessageEntity queryXmById(@RequestParam Long id) throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<XmEntity> list = xmService.queryXmById(id);
		System.err.println("list=======" + list);
		try {
			map.put("result", list);
		} catch (Exception e) {
			// logger.info("queryYasr==" + e.getMessage());
		}
		return new MessageEntity().addIsError(false).addContent("").addCallbackData(map).addTitle("");
	}
	@RequestMapping(value = "/editXm")
	@ResponseBody
	public MessageEntity editXm(@RequestBody XmEntity entity) {
		System.err.println("111-----==="+entity);
		try {
			this.xmService.updateXm(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}

	@RequestMapping(value = "/editXmImg")
	@ResponseBody
	public MessageEntity editXmImg(@RequestBody XmEntity entity) {
		System.err.println("111-----==="+entity);
		try {
			this.xmService.updateXmImg(entity);
		} catch (Exception e) {
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("Add failure!");
		}
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("Add success!");
	}
	
	@RequestMapping(value = "/uploadImage")
	@ResponseBody
	public String uploadPicture1( HttpServletRequest request) throws Exception {
	   String saveUrl = "上传失败！";
	   CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
	   if (multipartResolver.isMultipart(request)) {
	      MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
	      MultipartFile file = multiRequest.getFile("file");
	      System.out.println("111111111111"+file.getOriginalFilename());
	      String fileTyleName=PropertyUtil.getContextProperty("tp.sava.path")+"";
	      String fileName = file.getOriginalFilename();
	      fileName = UUID.randomUUID().toString().substring(0, 4)+System.currentTimeMillis()+fileName.substring(fileName.indexOf("."), fileName.length());
//	      String filePath = PropertyUtil.getContextProperty("tp.sava.path")+"/"+fileTyleName+"/";
	      String filePath =fileTyleName+File.separator;
	      if (!new File(filePath).exists()){
	         new File(filePath).mkdirs();
	      }
	      if(file!=null){
	         saveUrl = filePath+fileName;
	         System.err.println("--saveUrl-----"+saveUrl);
	         FileOutputStream os = new FileOutputStream(saveUrl);
	         InputStream in = file.getInputStream();
	         //以写字节的方式写文件
	         int b = 0;
	         while((b=in.read()) != -1){
	            os.write(b);
	         }
	         os.flush();
	         os.close();
	         in.close();
	      }
	   }
	   return saveUrl;
	}

	@RequestMapping(value = "/updateXmDjl")
	@ResponseBody
	public MessageEntity updateXmDjl(@RequestParam Map<String, Object> param, HttpServletRequest request)
			throws ParseException {
		try {
			xmService.updateXmDjlById(param);
		} catch (Exception e) {
			System.out.println(e);
			return new MessageEntity().addCode(1).addIsError(true).addTitle("错误").addContent("修改失败!");
		}
		// 添加通知
		return new MessageEntity().addCode(1).addIsError(false).addTitle("提示").addContent("修改成功!");
	}
}

