package com.zhixin.rd.memory.web.controller.common;

import com.zhixin.rd.memory.web.entity.XmEntity;
import com.zhixin.rd.memory.web.service.spnew.ISpNewService;
import com.zhixin.rd.memory.web.service.xm.IXmService;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

@Controller("commonControlle")
@RequestMapping(value = "/memory/common")
public class CommonController {

	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

	@Autowired
	IXmService xmService;

	@Autowired
	ISpNewService spNewService;

	@RequestMapping(value = "/imageshow")
	@ResponseBody
	public void showImage(@RequestParam String path, HttpServletResponse response) throws Exception {
		try {
			logger.info("======================params.get path========================" + path);
			File file = new File(path);
			FileInputStream fis =null;
			if (!file.exists()) {
				System.err.println("无此照片");
			} else {
				fis = new FileInputStream(file);
				int i = fis.available(); // 得到文件大小
				System.out.println(i);
				byte data[] = new byte[i];
				fis.read(data); // 读数据
				fis.close();
				response.setContentType("image"); // 设置返回的文件类型
				OutputStream toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象
				toClient.write(data); // 输出数据
				toClient.close();
			}
		} catch (Exception e) {
			logger.error("", e);
		}
	}

	@RequestMapping("/download")
	public void  download(@RequestParam String fjdz, HttpServletRequest request, HttpServletResponse response){
		logger.info("下载文件路径===" + fjdz);
		File tempFile = new File(fjdz.trim());
		String fileName = tempFile.getName();
		OutputStream out = null;
		try {
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition",
					"attachment; " + "filename=" + URLEncoder.encode(fileName, "UTF-8"));

			out = response.getOutputStream();
			out.write(FileUtils.readFileToByteArray(new File(fjdz)));
			out.flush();

		} catch (Exception e) {
//	      logger.error("",e);
		} finally {
			if(out != null){
				try {
					out.close();
				} catch (IOException e) {
//	            logger.error("",e);
				}
			}
		}
	}

	@RequestMapping(value = "/queryTjXm")
	@ResponseBody
	public List<XmEntity> dzList() {
		logger.info("----查询推荐项目");
		return xmService.queryTjXm();
	}

	@RequestMapping(value = "/queryNewSp")
	@ResponseBody
	public List<Map<String, Object>> queryNewSp() {
		return spNewService.queryAllSp();
	}

	@RequestMapping(value = "/queryNewSpById")
	@ResponseBody
	public Map<String, Object> queryNewSpById(@RequestParam Integer id) {
		return spNewService.queryAllSpById(id);
	}
}
