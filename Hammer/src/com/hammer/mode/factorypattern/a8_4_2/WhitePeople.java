package com.hammer.mode.factorypattern.a8_4_2;

import com.hammer.mode.factorypattern.a8_4_2.imp.Human;

public class WhitePeople implements Human {

	@Override
	public void getColor() {
		System.err.println("white");
	}

	@Override
	public void talk() {
		System.err.println("talk:w");

	}

}
