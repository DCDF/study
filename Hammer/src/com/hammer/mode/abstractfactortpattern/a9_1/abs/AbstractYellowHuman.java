package com.hammer.mode.abstractfactortpattern.a9_1.abs;

import com.hammer.mode.abstractfactortpattern.a9_1.inter.Human;

public abstract class AbstractYellowHuman implements Human {

	@Override
	public void getColor() {
		System.err.println("yellow");
	}

	@Override
	public void getTalk() {
		System.err.println("chinese");
	}

}
