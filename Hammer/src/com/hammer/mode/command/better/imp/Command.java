package com.hammer.mode.command.better.imp;

import com.hammer.mode.command.base.imp.Receiver;

//完美的Command类(减少Client对Reciver的依赖)
public abstract class Command {
	// 定义一个子类的全局共享变量
	protected final Receiver receiver;

	// 实现类必须定义一个接收者
	public Command(Receiver receiver) {//(多个接收者可用集合)
		this.receiver = receiver;
	}

	// 每个命令类都必须有一个执行命令方法
	public abstract void execute();
}
