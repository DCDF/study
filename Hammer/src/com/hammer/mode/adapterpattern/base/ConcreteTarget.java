package com.hammer.mode.adapterpattern.base;

import com.hammer.mode.adapterpattern.base.imp.Target;

//目标角色的实现类
public class ConcreteTarget implements Target {

	@Override
	public void request() {
		System.out.println("正常服役角色");
	}

}
