package com.zhixin.rd.rkjc.web.common;

import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64 {
	
	private static Logger logger = Logger.getLogger(Base64.class);

	// 加密
	public static String encode(String str) {
		byte[] b = null;
		String s = null;
		try {
			b = str.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.error("", e);
		}
		if (b != null) {
			s = new BASE64Encoder().encode(b);
		}
		return s;
	}

	// 解密
	public static String decode(String s) {
		byte[] b = null;
		String result = null;
		if (s != null) {
			BASE64Decoder decoder = new BASE64Decoder();
			try {
				b = decoder.decodeBuffer(s);
				result = new String(b, "utf-8");
			} catch (Exception e) {
				logger.error("", e);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str=Base64.encode("我是中国111aaaa我是中国111aaaa我是中国111aaaa我是中国111aaaa我是中国111aaaa");
		System.out.println(str);
		System.out.println(Base64.decode(str));
	}

}
