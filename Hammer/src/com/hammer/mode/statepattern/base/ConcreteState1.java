package com.hammer.mode.statepattern.base;

public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		// 本状态处理的逻辑
		System.out.println("state1 : handle1");
	}

	@Override
	public void handle2() {
		System.out.println("state1 : handle2");
		// 设置当前状态为stat2
		super.context.setCurrentState(Context.STATE2);
		//过渡到state2状态,由context实现
		super.context.handle2();
	}

}
