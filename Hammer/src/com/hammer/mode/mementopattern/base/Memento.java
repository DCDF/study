package com.hammer.mode.mementopattern.base;

//备忘录角色
public class Memento {

	// 发起人内部状态
	private String state = "";

	// 构建函数传递参数
	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
