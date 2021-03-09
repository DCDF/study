package com.hammer.utils;

import java.time.LocalDateTime;

public class HammerTime {

	public static LocalDateTime getFirstZhouYiDayOfMonth() {
		LocalDateTime time = LocalDateTime.now();
		LocalDateTime monthFirstDay = LocalDateTime.of(time.getYear(), time.getMonth(), 1, 0, 0);
		int value = monthFirstDay.getDayOfWeek().getValue();
		if (value != 1) {// 本月第一天不是新的一周开始的
			int over = 8 - value;
			monthFirstDay = LocalDateTime.of(time.getYear(), time.getMonth(), 1 + over, 0, 0);
		}
		return monthFirstDay;
	}
}
