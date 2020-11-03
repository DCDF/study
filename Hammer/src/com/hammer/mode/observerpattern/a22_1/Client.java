package com.hammer.mode.observerpattern.a22_1;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		LiSi lisi = new LiSi();

		HanFeiZi hanfeizi = new HanFeiZi();

		spy spy = new spy(hanfeizi, lisi, "fun");

		spy.start();
		Thread.sleep(1000);// 主线程等待1秒

		hanfeizi.haveBreakfast();
		//
		Thread.sleep(1000);
		hanfeizi.haveFun();
	}
}
