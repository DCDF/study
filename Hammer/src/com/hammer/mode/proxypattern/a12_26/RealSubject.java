package com.hammer.mode.proxypattern.a12_26;

import com.hammer.mode.proxypattern.a12_26.imp.Subject;

public class RealSubject implements Subject {

	@Override
	public void doSomething(String str) {
		System.out.println("doSomething : " + str);
	}

}
