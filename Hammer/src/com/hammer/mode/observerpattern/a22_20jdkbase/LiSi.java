package com.hammer.mode.observerpattern.a22_20jdkbase;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {

	public void report(String str) {
		System.out.println("报告,新动作:" + str);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("收到更新");
		this.report(arg.toString());
		System.out.println("处理结束");
	}
}
