package com.hammer.mode.proxypattern.a12_26;

import com.hammer.mode.proxypattern.a12_26.imp.Subject;

public class Client {
	public static void main(String[] args) {
		Subject subject = new RealSubject();

		MyInvocationHandler handler = new MyInvocationHandler(subject);

		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);

		proxy.doSomething("finish");
	}
}
