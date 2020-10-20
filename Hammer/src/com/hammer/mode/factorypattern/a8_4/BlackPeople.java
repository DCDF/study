package com.hammer.mode.factorypattern.a8_4;

import com.hammer.mode.factorypattern.a8_1.imp.Human;

public class BlackPeople implements Human {

	@Override
	public void getColor() {
		System.err.println("black");
	}

	@Override
	public void talk() {
		System.err.println("talk:b");

	}

}
