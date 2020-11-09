package com.hammer.mode.statepattern.base;

public class Context {
	// 定义状态
	public final static State STATE1 = new ConcreteState1();
	public final static State STATE2 = new ConcreteState2();

	// 当前状态
	private State currentState;

	public State getCurrentState() {
		return currentState;
	}

	// 设置当前状态
	public void setCurrentState(State currentState) {
		System.out.println("重新设置状态:"+currentState.getClass().getSimpleName());
		this.currentState = currentState;
		//状态切换
		this.currentState.setContext(this);
	}

	// 行为委托
	public void handle1() {
		this.currentState.handle1();
	}

	public void handle2() {
		this.currentState.handle2();
	}
}
