package com.hammer.mode.observerpattern.base;

import com.hammer.mode.observerpattern.base.imp.Subject;

public class ConcreteSubject extends Subject {
	// 具体的业务
	public void doSomething() {
		// TODO
		super.notifyObservers();
	}
}
