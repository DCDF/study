package com.hammer.mode.command.better;

import com.hammer.mode.command.better.imp.Command;

public class Client {
	public static void main(String[] args) {
		// 简化后命令完成单一指责,而不是根据接收者不同完成不同的职责
		Invoker invoker = new Invoker();

		Command command = new ConcreteCommand1();

		invoker.setCommand(command);
		invoker.action();
	}
}
