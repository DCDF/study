package com.hammer.mode.proxypattern.a12_32;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	//被代理的对象
	private Object obj = null;

	public MyInvocationHandler(Object _obj) {
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		return method.invoke(this.obj, args);
	}

}
