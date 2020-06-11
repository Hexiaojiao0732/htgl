package com.zhixin.rd.rkjc.web.common;

import java.text.DecimalFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FormatUtil {
	
	private static final Logger logger =LoggerFactory.getLogger(FormatUtil.class);
	// 小数点2位
	public static final DecimalFormat DECIMAL_2_FORMAT = new DecimalFormat("#.00");  
	// 十位数
	public static final DecimalFormat DECADE_FORMAT = new DecimalFormat("00"); 
	
	
	public static void main(String arg[]){
		System.out.println(DECADE_FORMAT.format(1));
	}
	
	
}
