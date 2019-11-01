package com.yxf.backstage.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 * @author win
 */
public class DateUtils {
	
	private static final String DATE_STR= "yyyy-MM-dd HH:mm:ss";
	/**
	 * 获取现在时间
	 * @return 返回时间类型 yyyy-MM-dd HH:mm:ss
	 */
	public static Date getNowDate() {
		 Date currentTime = new Date();
		 SimpleDateFormat formatter = new SimpleDateFormat(DATE_STR);
		 String dateString = formatter.format(currentTime);
		 ParsePosition pos = new ParsePosition(8);
		 Date currentTime_2 = formatter.parse(dateString, pos);
		 return currentTime_2;
	}
	
	/**
	 * 获取现在时间
	 * @return返回字符串格式 yyyy-MM-dd HH:mm:ss
	 */
	public static String getStringDate() {
		 Date currentTime = new Date();
		 SimpleDateFormat formatter = new SimpleDateFormat(DATE_STR);
		 String dateString = formatter.format(currentTime);
		 return dateString;
	}
}
