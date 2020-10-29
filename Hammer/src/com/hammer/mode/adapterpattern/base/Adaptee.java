package com.hammer.mode.adapterpattern.base;

//源角色:也是服役状态
public class Adaptee {
	//原有的业务逻辑
	public void doSomething() {
		System.out.println("正在服役的想转换的角色");
	}
}
