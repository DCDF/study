package com.hammer.mode.proxypattern.a12_32;

import com.hammer.mode.proxypattern.a12_32.imp.IAdvice;

public class BeforeAdvice implements IAdvice {

	@Override
	public void exec() {
		System.out.println("我是前置通知,被执行了");
	}

}
