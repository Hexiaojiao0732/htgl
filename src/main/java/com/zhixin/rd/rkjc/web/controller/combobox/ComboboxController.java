package com.zhixin.rd.rkjc.web.controller.combobox;

import com.zhixin.rd.rkjc.web.entity.ComboboxEntity;
import com.zhixin.rd.rkjc.web.service.combobox.IComboboxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/rkjc/combobox")
public class ComboboxController {

	private static final Logger logger = LoggerFactory.getLogger(ComboboxController.class);

	@Autowired
	private IComboboxService comboboxService;

	@RequestMapping(value = "/certificateTypes")
	@ResponseBody
	public List<ComboboxEntity> getCertificateTypeCombobox(@RequestParam Map<String, Object> params,
														   HttpServletRequest request, HttpServletResponse response) throws Exception {
		return this.comboboxService.listCertificateType(params);
	}

	@RequestMapping(value = "/getAllInterrogateAreaName")
	@ResponseBody
	public List<ComboboxEntity> getAllInterrogateAreaName(@RequestParam Map<String, Object> params,
														  HttpServletRequest request, HttpServletResponse response) throws Exception {
		return this.comboboxService.getAllInterrogateAreaName(params);
	}

	// 查询所有部门信息---w.xb
	@RequestMapping(value = "/listAllOrganizationNameCombobox")
	@ResponseBody
	public List<ComboboxEntity> listAllOrganizationNameCombobox(@RequestParam Map<String, Object> params,
																HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<ComboboxEntity> list =  this.comboboxService.listAllOrganizationName(params);
		return list;
	}

}
