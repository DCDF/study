package com.hammer.mode.command.better;

import com.hammer.mode.command.base.ConcreteReciver1;
import com.hammer.mode.command.base.imp.Receiver;
import com.hammer.mode.command.better.imp.Command;

public class ConcreteCommand1 extends Command {

	// 声明自己的默认接收者
	public ConcreteCommand1() {
		super(new ConcreteReciver1());
	}

	// 设置新的接收者
	public ConcreteCommand1(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {

		// 业务处理
		super.receiver.doSomething();
	}

}
