package com.hammer.mode.adapterpattern.base;

import com.hammer.mode.adapterpattern.base.imp.Target;

//适配器角色
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		//通过实现目标角色的方法实现转换
		super.doSomething();
	}

}
