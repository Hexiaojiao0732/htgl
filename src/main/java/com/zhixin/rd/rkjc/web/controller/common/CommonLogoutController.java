package com.zhixin.rd.rkjc.web.controller.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class CommonLogoutController {

	private static final Logger logger = LoggerFactory.getLogger(CommonLogoutController.class);

	@RequestMapping(value = "/logout")
	@ResponseBody
	public void logOut(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			HttpSession session = request.getSession();
			// TODO
			session.removeAttribute("userInfo");
			session.removeAttribute("css");
			session.removeAttribute("laptopSessionInfo");
			session.invalidate();
			response.sendRedirect(request.getContextPath() + "/login.html");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

}
