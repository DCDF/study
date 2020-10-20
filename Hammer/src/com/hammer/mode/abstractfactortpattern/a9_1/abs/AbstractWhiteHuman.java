package com.hammer.mode.abstractfactortpattern.a9_1.abs;

import com.hammer.mode.abstractfactortpattern.a9_1.inter.Human;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void getColor() {
		System.err.println("white");
	}

	@Override
	public void getTalk() {
		System.err.println("english");
	}

}
