package com.framestudy.springjpa.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String date2String(Date date,String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}
	
	
	public static Date string2Date(String str,String pattern) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.parse(str);
	}
	
	
	
	
	
	
}
