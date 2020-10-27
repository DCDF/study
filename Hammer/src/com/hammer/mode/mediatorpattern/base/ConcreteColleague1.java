package com.hammer.mode.mediatorpattern.base;

import com.hammer.mode.mediatorpattern.base.imp.Colleague;
import com.hammer.mode.mediatorpattern.base.imp.Mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator _mediator) {
		super(_mediator);
	}

	// 自有方法 (自发行为,与其他同事类,中介没有关联)
	public void selfMethod1() {
		// 处理自己的逻辑
	}

	// 依赖方法(依赖中介者才能完成的行为)
	public void depMethod1() {
		// 处理自己的逻辑
		// 自己不能处理的,委托给中介者处理
		super.mediator.doSomething1();
	}
}
