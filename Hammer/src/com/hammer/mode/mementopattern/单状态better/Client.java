package com.hammer.mode.mementopattern.单状态better;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();

		originator.setState("初始状态");
		System.out.println(originator.getState());
		// 备份
		originator.createMemento();
		originator.setState("修改后状态");
		System.out.println(originator.getState());
		// 恢复
		originator.restoreMemento();
		System.out.println("恢复后状态:" + originator.getState());

	}
}
