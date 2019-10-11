package com.liuxu.common.utils;

import java.util.Calendar;
import java.util.Date;

/*
 * 日期的工具类
 *
 */
public class DateUtil {
	
	/*
	* 方法1：(5分)  
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	
	// 返回月初得日期
	
	public static Date getDateByInitMonth(Date src){
		// 获取日历类
		Calendar date = Calendar.getInstance();
		
		// 用传入得日期初始化日历类
		 date.setTime(src);
		 
		 // 改变日期设置为月初(1号的 00:00:00)
		 date.set(Calendar.DAY_OF_MONTH, 1);
		 date.set(Calendar.HOUR_OF_DAY, 0);
		 date.set(Calendar.MINUTE, 0);
		 date.set(Calendar.SECOND, 0);
		 
		 
		 
		return date.getTime();
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	
	// 返回的到的日期的月末
	
	public static Date getDateByFullMonth(Date src){
		// 把传入的月分+1，再把小时分秒都设置为0，最后，让日期减去1秒
		// 获取日期类
		Calendar date = Calendar.getInstance();
		// 把传入的日期初始化日历类
		date.setTime(src);
		// 让月份加1
		date.add(Calendar.MONTH, 1);
		// 调用月初的工具类返回月处
		Date day = getDateByInitMonth(date.getTime());
		// 用月初初始化日历类
		date.setTime(day);
		// 让日期减去1
		date.add(Calendar.SECOND, -1);
		// 
		return date.getTime();
	}
	
}
