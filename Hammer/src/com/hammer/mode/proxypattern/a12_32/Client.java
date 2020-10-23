package com.hammer.mode.proxypattern.a12_32;

import com.hammer.mode.proxypattern.a12_32.imp.Subject;

public class Client {
	public static void main(String[] args) {
		Subject subject = new RealSubject();

		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);

		proxy.doSomething("finish");
	}
}
