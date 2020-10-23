package com.hammer.mode.proxypattern.a12_32;

import java.lang.reflect.InvocationHandler;

import com.hammer.mode.proxypattern.a12_32.imp.Subject;

public class SubjectDynamicProxy extends DynamicProxy {
	public static <T> T newProxyInstance(Subject subject) {

		ClassLoader cl = subject.getClass().getClassLoader();
		Class<?>[] interfaces = subject.getClass().getInterfaces();
		InvocationHandler h = new MyInvocationHandler(subject);
		return newProxyInstance(cl, interfaces, h);
	}
}
