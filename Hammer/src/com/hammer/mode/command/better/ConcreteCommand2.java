package com.hammer.mode.command.better;

import com.hammer.mode.command.base.ConcreteReviver2;
import com.hammer.mode.command.base.imp.Receiver;
import com.hammer.mode.command.better.imp.Command;

public class ConcreteCommand2 extends Command {

	// 声明自己的默认接收者
	public ConcreteCommand2() {
		super(new ConcreteReviver2());
	}

	// 设置新的接收者
	public ConcreteCommand2(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {

		// 业务处理
		super.receiver.doSomething();
	}

}
