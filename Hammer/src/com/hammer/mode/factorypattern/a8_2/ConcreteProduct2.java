package com.hammer.mode.factorypattern.a8_2;

public class ConcreteProduct2 extends Product {

	@Override
	public void method2() {
		System.err.println(this.getClass().getSimpleName());
	}

}
