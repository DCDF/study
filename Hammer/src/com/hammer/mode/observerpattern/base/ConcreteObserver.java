package com.hammer.mode.observerpattern.base;

import com.hammer.mode.observerpattern.base.imp.Observer;

public class ConcreteObserver implements Observer{

	@Override
	public void update() {
		System.out.println("接收到消息,处理");
	}

}
