package com.hammer.mode.command.base;

import com.hammer.mode.command.base.imp.Command;
import com.hammer.mode.command.base.imp.Receiver;

public class ConcreteCommand1 extends Command {

	// 对哪个Receriver类进行命令处理
	private Receiver receiver;

	// 构造函数传递接收者
	public ConcreteCommand1(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// 业务处理
		this.receiver.doSomething();
	}

}
