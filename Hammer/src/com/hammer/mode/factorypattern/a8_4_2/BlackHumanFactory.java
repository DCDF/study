package com.hammer.mode.factorypattern.a8_4_2;

import com.hammer.mode.factorypattern.a8_4_2.imp.Human;

public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackPeople();
	}

}
