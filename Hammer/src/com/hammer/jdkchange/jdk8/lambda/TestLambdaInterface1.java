package com.hammer.jdkchange.jdk8.lambda;

//注解是提醒别人,这是个函数式接口,只能有一个抽象方法,默认方法不限
@FunctionalInterface
public interface TestLambdaInterface1 {
	// 只有一个未实现方法的接口可使用lambda
	public int method();

	public default void method2() {
		System.err.println("method2");
	}
}
