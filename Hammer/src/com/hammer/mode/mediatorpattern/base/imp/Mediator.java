package com.hammer.mode.mediatorpattern.base.imp;

import com.hammer.mode.mediatorpattern.base.ConcreteColleague1;
import com.hammer.mode.mediatorpattern.base.ConcreteColleague2;

public abstract class Mediator {
	// 定义同事类
	protected ConcreteColleague1 c1;

	protected ConcreteColleague2 c2;

	// 通过getter/setter方法把同事类注入
	public ConcreteColleague1 getC1() {
		return c1;
	}

	public ConcreteColleague2 getC2() {
		return c2;
	}

	public void setC1(ConcreteColleague1 c1) {
		this.c1 = c1;
	}

	public void setC2(ConcreteColleague2 c2) {
		this.c2 = c2;
	}

	public abstract void doSomething1();

	public abstract void doSomething2();
}
