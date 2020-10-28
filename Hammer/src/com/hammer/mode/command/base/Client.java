package com.hammer.mode.command.base;

import com.hammer.mode.command.base.imp.Command;
import com.hammer.mode.command.base.imp.Receiver;

public class Client {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();

		Receiver receiver = new ConcreteReciver1();

		Command command = new ConcreteCommand1(receiver);

		invoker.setCommand(command);
		invoker.action();
	}
}
