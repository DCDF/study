package com.hammer.mode.observerpattern.base;

import com.hammer.mode.observerpattern.base.imp.Observer;

public class Client {
	public static void main(String[] args) {
		// 被观察者
		ConcreteSubject subject = new ConcreteSubject();

		// 定义一个观察者
		Observer obs = new ConcreteObserver();

		// 观察
		subject.addObserver(obs);

		// 观察者活动
		subject.doSomething();
	}
}
