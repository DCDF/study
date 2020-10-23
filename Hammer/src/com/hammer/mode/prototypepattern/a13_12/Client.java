package com.hammer.mode.prototypepattern.a13_12;

public class Client {
	// 浅拷贝测试
	public static void main(String[] args) {

		Thing thing1 = new Thing();

		thing1.setList("张三");

		Thing thing2 = thing1.clone();

		thing2.setList("李四");

		System.out.println("thing1 == thing2:" + (thing1 == thing2) + " thing1的list:" + thing1.getList());
	
	}
}
