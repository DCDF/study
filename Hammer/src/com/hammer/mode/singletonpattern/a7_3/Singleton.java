package com.hammer.mode.singletonpattern.a7_3;

public class Singleton {
	
	//该通用例子不会产生多个对象,线程安全的
	//饿汉式
	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

	// 类中其他方法尽量是static
	public static void doSomething() {

	}
}
