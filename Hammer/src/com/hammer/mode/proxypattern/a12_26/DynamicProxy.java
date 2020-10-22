package com.hammer.mode.proxypattern.a12_26;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {

	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(ClassLoader cl, Class<?>[] interfaces, InvocationHandler h) {

		// 寻访JoinPoint连接点(AOP术语,在什么地方),AOP框架使用元数据定义
		if (true) {//(通知:术语 行为的意思)
			(new BeforeAdvice()).exec();
		}
		return (T) Proxy.newProxyInstance(cl, interfaces, h);
	}
}
