package com.zhixin.rd.memory.web.util;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

public class IpUtils {

	private static final String[] HEADERS = { "X-Forwarded-For", "Proxy-Client-IP", "WL-Proxy-Client-IP",
			"HTTP_X_FORWARDED_FOR", "HTTP_X_FORWARDED", "HTTP_X_CLUSTER_CLIENT_IP", "HTTP_CLIENT_IP",
			"HTTP_FORWARDED_FOR", "HTTP_FORWARDED", "HTTP_VIA", "REMOTE_ADDR", "X-Real-IP" };

	/**
	 * 判断ip是否为空，空返回true
	 * 
	 * @param ip
	 * @return
	 */
	public static boolean isEmptyIp(final String ip) {
		return (ip == null || ip.length() == 0 || ip.trim().equals("") || "unknown".equalsIgnoreCase(ip));
	}

	/**
	 * 判断ip是否不为空，不为空返回true
	 * 
	 * @param ip
	 * @return
	 */
	public static boolean isNotEmptyIp(final String ip) {
		return !isEmptyIp(ip);
	}

	/***
	 * 获取客户端ip地址(可以穿透代理)
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @return
	 */
	public static String getIpAddress(HttpServletRequest request) {
		String ip = "";
		for (String header : HEADERS) {
			ip = request.getHeader(header);
			if (isNotEmptyIp(ip)) {
				break;
			}
		}
		if (isEmptyIp(ip)) {
			ip = request.getRemoteAddr();
		}
		if (isNotEmptyIp(ip) && ip.contains(",")) {
			ip = ip.split(",")[0];
		}
		if ("0:0:0:0:0:0:0:1".equals(ip)) {
			ip = "127.0.0.1";
		}
		return ip;
	}

	/**
	 * 获取本机的局域网ip地址，兼容Linux
	 * 
	 * @return String
	 * @throws Exception
	 */
	public String getLocalHostIP() throws Exception {
		Enumeration<NetworkInterface> allNetInterfaces = NetworkInterface.getNetworkInterfaces();
		String localHostAddress = "";
		while (allNetInterfaces.hasMoreElements()) {
			NetworkInterface networkInterface = allNetInterfaces.nextElement();
			Enumeration<InetAddress> address = networkInterface.getInetAddresses();
			while (address.hasMoreElements()) {
				InetAddress inetAddress = address.nextElement();
				if (inetAddress != null && inetAddress instanceof Inet4Address) {
					localHostAddress = inetAddress.getHostAddress();
				}
			}
		}
		return localHostAddress;
	}
	
	public static String getIp(HttpServletRequest request) throws Exception {
	    String ip = request.getHeader("X-Forwarded-For");
	    if (ip != null) {
	        if (!ip.isEmpty() && !"unKnown".equalsIgnoreCase(ip)) {
	            int index = ip.indexOf(",");
	            if (index != -1) {
	                return ip.substring(0, index);
	            } else {
	                return ip;
	            }
	        }
	    }
	    ip = request.getHeader("X-Real-IP");
	    if (ip != null) {
	        if (!ip.isEmpty() && !"unKnown".equalsIgnoreCase(ip)) {
	            return ip;
	        }
	    }
	    return request.getRemoteAddr();
	}
	

}
