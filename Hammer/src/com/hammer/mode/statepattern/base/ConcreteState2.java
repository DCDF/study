package com.hammer.mode.statepattern.base;

public class ConcreteState2 extends State {

	@Override
	public void handle1() {
		System.out.println("state2 : handle1");
		//设置当前状态为stat1
		super.context.setCurrentState(Context.STATE1);
		//过渡到state1状态,由context实现
		super.context.handle1();
	}

	@Override
	public void handle2() {
		System.out.println("state2 : handle2");
		//本状态处理的逻辑
	}

}
