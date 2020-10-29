package com.hammer.mode.adapterpattern.base;

import com.hammer.mode.adapterpattern.base.imp.Target;

public class Client {
	public static void main(String[] args) {
		// 原有的业务逻辑
		Target target = new ConcreteTarget();
		target.request();

		// 现在增加矮了适配器角色后的业务逻辑
		Target target2 = new Adapter();
		target2.request();
	}
}
