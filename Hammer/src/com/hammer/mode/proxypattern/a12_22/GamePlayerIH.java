package com.hammer.mode.proxypattern.a12_22;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {

	// 被代理者
	Class cls = null;

	// 被代理的实例
	Object obj = null;

	// 代理谁
	public GamePlayerIH(Object _obj) {
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().equalsIgnoreCase("login")) {
			System.err.println("有人在用我的账号登录");
		}
		Object result = method.invoke(this.obj, args);
		return result;
	}

}
