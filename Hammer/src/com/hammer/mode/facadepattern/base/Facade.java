package com.hammer.mode.facadepattern.base;
//门面角色
public class Facade {
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	private ClassC c = new ClassC();

	public void methodA() {
		this.a.doSomwthingA();
	}

	public void methodB() {
		this.b.doSomwthingB();
	}

	public void methodC() {
		this.c.doSomwthingC();
	}
}
