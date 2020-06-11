package com.zhixin.rd.rkjc.web.common;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * mysql 相关转换类
 * @author wgh
 *
 */
public class MySqlUtil {
	private static final Logger logger = LoggerFactory.getLogger(MySqlUtil.class);
	/*
	 * mysql to_day方法day开始于公元0年1月1日
	 * 相对对于java时间开始的1970年1月1日的标准值
	 * */
	private static final long DAYOF_1970=719528L;
	
	/**
	 * mysql to_days转换成时间
	 * @param days
	 * @return
	 */
	public static Date daysToDate(long days){
		if(days<DAYOF_1970){
			return new Date(0L);
		}else{
			return new Date(((days-DAYOF_1970)*24-8)*60*60*1000);
		}
		
	}
	
	/**
	 * 时间转换成 to_days值,需要减去8小时东8区时间
	 * @param time
	 * @return
	 */
	public static long TimeToDays(long time){
		return ((time-8*60*60*1000)/(24*60*60*1000))+DAYOF_1970;
	}
	
	/**
	 * 时间转换成 to_days值,需要减去8小时东8区时间
	 * @param time
	 * @return
	 */
	public static long TimeToDays(Date date){
		if(date==null){
			return DAYOF_1970;
		}else{
			return TimeToDays(date.getTime());
		}
	}

    public static void main(String[] args) {

    	System.out.println(daysToDate(736329));	
    	System.out.println(daysToDate(736592));	
    	System.out.println(TimeToDays(System.currentTimeMillis()));	
    }
}
