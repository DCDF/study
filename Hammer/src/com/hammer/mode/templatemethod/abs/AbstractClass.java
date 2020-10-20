package com.hammer.mode.templatemethod.abs;

public abstract class AbstractClass {
	protected abstract void doAnything();
	protected abstract void doSomething();
	
	public void templateMethod() {
		this.doAnything();
		this.doSomething();
	}
}
