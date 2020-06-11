package com.zhixin.rd.rkjc.web.controller.common;

import com.zhixin.rd.rkjc.web.common.PropertyUtil;
import com.zhixin.rd.rkjc.web.entity.DmDzEntity;
import com.zhixin.rd.rkjc.web.service.dmdz.IDmDzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;


/**
 * 各种公用list方法
 * 不要都写UserAuthorityInterceptor例外里
 * @author wgh
 *
 */
@Controller
@RequestMapping(value = "/common")
public class CommonController {
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

	@Autowired
	private IDmDzService dmDzService;


	private String getCSUrl(int orgId,HttpServletRequest request){
		Object recordUrl = PropertyUtil.getContextProperty("video.address");
		Object webserviceIp = PropertyUtil.getContextProperty("webservice.ip");
		Object webservicePort = PropertyUtil.getContextProperty("webservice.port");
		
		String webserviceUrl = webserviceIp+":"+webservicePort;
		String param =  orgId + " " + "http://"+webserviceUrl +request.getContextPath();
		return recordUrl + " " + param;
	}

//	/**
//	 * 根据警员编号获取警员信息
//	 * @param json
//	 * @param request
//	 * @param response
//	 * @return
//	 */
//	@RequestMapping(value = "/getUserByCertificateNo")
//	@ResponseBody
//	public UserEntity getUserByCertificateNo(@RequestBody JSONObject json,HttpServletRequest request, HttpServletResponse response){
//
//		UserEntity userEntity=null;
//		try {
//			logger.info(json.getString("no"));
//			logger.info(json.toJSONString());
//			userEntity=userService.getUserByCertificateNo(json.getString("no"));
//
//		} catch (Exception e) {
//			logger.error(e.getMessage(),e);
//		}
//		if(userEntity==null){
//			userEntity=new UserEntity();
//			userEntity.setId(-1);
//		}
//		return userEntity;
//	}

	/**
	 * 查询省市县三级数据
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "/dzList")
	@ResponseBody
	public List<DmDzEntity> dzList(@RequestParam Map<String, Object> params) {
		return dmDzService.list(params);
	}

	/**
	 * 上传图片到服务器指定位置
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/uploadImage")
	public void uploadPicture1( HttpServletRequest request,HttpServletResponse response) throws Exception {
		String imgSrc = request.getParameter("imgSrc");
		logger.info("获取到的路径地址为："+imgSrc);
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		if (multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			MultipartFile file = multiRequest.getFile("file");
			if(file!=null){
				String saveUrl = PropertyUtil.getContextProperty("rk.combinePhotoSavePath")+"/"+imgSrc;
				logger.info("最终图像保存路径为："+saveUrl);
				FileOutputStream os = new FileOutputStream(saveUrl);
				FileInputStream in = (FileInputStream) file.getInputStream();
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
	}

}