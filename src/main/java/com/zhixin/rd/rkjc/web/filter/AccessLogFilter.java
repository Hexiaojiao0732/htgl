package com.zhixin.rd.rkjc.web.filter;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessLogFilter implements Filter {

	private static final Logger logger = LoggerFactory.getLogger(AccessLogFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		String ip = getRemoteHost(httpRequest);

//		if (httpRequest.getServletPath().indexOf("pq.jsp") > -1) {
//			// 获得请求参数map
//			Enumeration<String> a = request.getParameterNames();
//			String parm = null;
//			String value = "";
//			while (a.hasMoreElements()) {
//				// 参数名
//				parm = a.nextElement();
//				// 值
//				value = request.getParameter(parm);
//				System.out.println("======AccessLogFilter===== 111 parm:" + parm + ",value:" + value);
//			}
//
//			Map<String, String[]> params = request.getParameterMap();
//			String queryString = "";
//			for (String key : params.keySet()) {
//				String[] values = params.get(key);
//				for (int i = 0; i < values.length; i++) {
//					String val = values[i];
//					queryString += key + "=" + val + "&";
//				}
//			}
//			// 去掉最后一个空格
//			queryString = queryString.substring(0, queryString.length() - 1);
//			System.out.println("======AccessLogFilter===== 222 queryString:" + queryString);
//
//
//		}
		chain.doFilter(request, response);
		return;

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}

	private String getRemoteHost(HttpServletRequest request) {
		String ip = request.getHeader("X-Real-IP");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("x-forwarded-for");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : ip;
	}

}
