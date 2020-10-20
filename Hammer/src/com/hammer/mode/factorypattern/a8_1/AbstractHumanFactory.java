package com.hammer.mode.factorypattern.a8_1;

import com.hammer.mode.factorypattern.a8_1.imp.Human;

public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> c);
}
