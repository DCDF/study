package com.hammer.mode.proxypattern.a12_21;

import com.hammer.mode.proxypattern.a12_6.RealSubject;
import com.hammer.mode.proxypattern.a12_6.imp.Subject;

//虚拟代理
public class Proxy implements Subject {

	// 要代理哪个实现类
	private Subject subject = null;

	// 默认被代理者
	public Proxy() {

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
		// TODO 虚拟代理就是在使用时初始化主体对象,缺点是每个方法都需要判断主体对象是否初始化
		if (this.subject == null) {
			this.subject = new RealSubject();
		}
		before();
		this.subject.request();
		after();
	}

}
