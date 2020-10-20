package com.hammer.mode.factorypattern.a8_4_2;

import com.hammer.mode.factorypattern.a8_4_2.imp.Human;

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
