package com.hammer.mode.singletonpattern.a7_3_4;

public class Singleton {

	// 该例子在高并发情况下可能出现多个实例
	//如给getInstance增加synchoronized则为懒汉式
	private static Singleton instance = null;

	private Singleton() {

	}

	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// 类中其他方法尽量是static
	public static void doSomething() {

	}
}
