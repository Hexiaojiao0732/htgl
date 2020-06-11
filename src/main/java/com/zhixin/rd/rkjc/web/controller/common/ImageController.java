package com.zhixin.rd.rkjc.web.controller.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhixin.rd.rkjc.web.common.PropertyUtil;

@Controller
@RequestMapping("/interrogate")
public class ImageController {

	private static final Logger logger = LoggerFactory.getLogger(ImageController.class);




	@RequestMapping(value = "/imageshow")
	@ResponseBody
	public void showImage(@RequestParam Map<String, Object> params, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		try {
			logger.info("======================params.get path========================" + params.get("path"));
			// ,String filename,String path
			String filepath = null;
			String path = params.get("path").toString();
			if ("faceImageFileSavePath".equals(params.get("path"))) {
				filepath = PropertyUtil.getContextProperty("faceImageFileSavePath").toString()
						+ params.get("image").toString().substring(6, 14) + File.separator
						+ params.get("image");
				logger.info("======================filepath========================" + filepath);
			} else {
				filepath = path;
			}

			// FileInputStream is = new FileInputStream("d:/pic/IMG_0534.jpg");
			File file = new File(filepath);
			FileInputStream fis =null;
			if (!file.exists()) {
				System.err.println("无此照片");
			} else {
				fis = new FileInputStream(filepath);
				int i = fis.available(); // 得到文件大小
				System.out.println(i);
				byte data[] = new byte[i];
				fis.read(data); // 读数据
				fis.close();
				response.setContentType("image/*"); // 设置返回的文件类型
				OutputStream toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象
				toClient.write(data); // 输出数据
				toClient.close();
			}
		} catch (Exception e) {
			logger.error("", e);
		}
	}


}