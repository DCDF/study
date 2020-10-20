package com.hammer.mode.proxypattern.a12_6;

import com.hammer.mode.proxypattern.a12_6.imp.Subject;

//代理类(核心)
public class Proxy implements Subject {

	// 要代理哪个实现类
	private Subject subject = null;

	// 默认被代理者
	public Proxy() {
		subject = new Proxy();
	}

	// 通过构建参数传递代理者
	public Proxy(Object... objects) {

	}

	public void before() {
		// do something
	}

	public void after() {
		// do something
	}

	@Override
	public void request() {
		before();
		this.subject.request();
		after();
	}

}
