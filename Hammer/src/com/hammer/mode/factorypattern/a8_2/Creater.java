package com.hammer.mode.factorypattern.a8_2;

public abstract class Creater {
	public abstract <T extends Product> T create(Class<T> c);
}
