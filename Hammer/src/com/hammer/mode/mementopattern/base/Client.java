package com.hammer.mode.mementopattern.base;

public class Client {
	public static void main(String[] args) {

		// 发起人
		Originator originator = new Originator();

		// 备忘录管理员
		Caretaker caretaker = new Caretaker();

		// 创建备忘录
		caretaker.setMemento(originator.createMemento());

		// 恢复一个备忘录
		originator.restoreMemento(caretaker.getMemento());
	}
}
