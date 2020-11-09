package com.hammer.mode.statepattern.base;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
//		context.setCurrentState(new ConcreteState1());
		context.setCurrentState(Context.STATE1);
		
		context.handle1();
		context.handle2();
	}
}
