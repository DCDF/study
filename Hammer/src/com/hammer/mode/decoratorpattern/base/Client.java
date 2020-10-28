package com.hammer.mode.decoratorpattern.base;

import com.hammer.mode.decoratorpattern.base.imp.Component;

public class Client {
	public static void main(String[] args) {
		Component base = new ConcreteComponent();

		// 开始第一次修饰
		base = new ConcreteDecorator1(base);
		// 开始第二次修饰
		base = new ConcreteDecorator2(base);

		base.operate();
	}
}
