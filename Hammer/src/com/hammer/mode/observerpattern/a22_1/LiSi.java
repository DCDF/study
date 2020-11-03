package com.hammer.mode.observerpattern.a22_1;

import com.hammer.mode.observerpattern.a22_1.imp.ILiSi;

public class LiSi implements ILiSi {

	@Override
	public void update(String str) {
		System.out.println("观察到动作");
		this.report(str);
		System.out.println("汇报结束");
	}

	public void report(String str) {
		System.out.println("报告,新动作:" + str);
	}
}
