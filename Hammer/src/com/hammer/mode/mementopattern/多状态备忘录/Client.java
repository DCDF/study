package com.hammer.mode.mementopattern.多状态备忘录;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();

		// 初始化
		originator.setState1("状态1");
		originator.setState2("状态2");
		originator.setState3("状态3");

		System.out.println("初始化:" + originator);
		Caretaker caretaker = new Caretaker();
		// 备份
		System.out.println("备份");
		caretaker.setMemento(originator.createMemento());

		originator.setState1("改变1");
		originator.setState2("改变2");
		originator.setState3("改变3");
		System.out.println("改变:" + originator);

		// 恢复
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("恢复:" + originator);
	}
}
