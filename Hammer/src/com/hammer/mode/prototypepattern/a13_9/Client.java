package com.hammer.mode.prototypepattern.a13_9;

public class Client {
	public static void main(String[] args) {

		// 验证clone不会触发构造函数

		Thing thing1 = new Thing();

		// 拷贝
		Thing thing2 = thing1.clone();

	}
}
