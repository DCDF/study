package com.hammer.mode.factorypattern.a8_4_2;

import com.hammer.mode.factorypattern.a8_4_2.imp.Human;

public class YellowPeople implements Human {

	@Override
	public void getColor() {
		System.err.println("yellow");
	}

	@Override
	public void talk() {
		System.err.println("talk:y");

	}

}
