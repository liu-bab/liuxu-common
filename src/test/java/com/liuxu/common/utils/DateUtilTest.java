package com.liuxu.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {
	// 返回月初的类
	@Test
	public void testGetDateByInitMonth() {
		Calendar day = Calendar.getInstance();
		day.set(2016, 1, 12, 12, 12, 12);
		
		Date date = DateUtil.getDateByInitMonth(day.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	
	// 返回月末的类
	@Test
	public void testGetDateByFullMonth() {
		
		Date date = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

}
