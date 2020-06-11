package com.zhixin.rd.rkjc.web.controller.common;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhixin.rd.rkjc.web.common.PropertyUtil;

/**
 * 文件上传处理
 * 
 * @author shenjunbo
 * 
 */
@Controller
@RequestMapping(value = "/file")
public class FileController {
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);


	
	@RequestMapping("/download")
	public void  download(@RequestParam String filename, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String filePath = (String) PropertyUtil.getContextProperty("plugins.download.path") + File.separator + filename;

		File file = new File(filePath);
		if (file.exists()) {
			OutputStream out = null;
			try {
				response.setContentType("application/octet-stream");
				response.setHeader("Content-Disposition",
						"attachment; " + "filename=" + URLEncoder.encode(filename, "UTF-8"));

				out = response.getOutputStream();
				out.write(FileUtils.readFileToByteArray(new File(filePath)));
				out.flush();

			} catch (Exception e) {
				logger.error("", e);
				throw new Exception("下载失败！请联系管理员！"+e);
			} finally {
				if (out != null) {
					try {
						out.close();
					} catch (IOException e) {
						logger.error("", e);
					}
				}
			}
		}else{
			throw new Exception("文件不存在，下载失败！请联系管理员！");
		}
	}
	
	
	
	private String getFileDesc(int caseDataType){
		
		if(caseDataType == 1){
			return "法律手续";
		}
		if(caseDataType == 2){
			return "口供材料";
		}
		if(caseDataType == 3){
			return "证据材料";
		}
		if(caseDataType == 4){
			return "视频材料";
		}
		if(caseDataType == 5){
			return "其它材料";
		}
		
		return "";
		
	}
	
}