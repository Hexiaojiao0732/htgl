package com.zhixin.rd.rkjc.web.common;

public class SMSUtil {
	public static boolean testPhone(String num){
		return num.matches("^(13|15|18|14|17)\\d{9}$");
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(testPhone("11011881188"));
	}
}
