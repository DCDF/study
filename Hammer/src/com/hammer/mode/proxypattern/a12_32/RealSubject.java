package com.hammer.mode.proxypattern.a12_32;

import com.hammer.mode.proxypattern.a12_32.imp.Subject;

public class RealSubject implements Subject {

	@Override
	public void doSomething(String str) {
		System.out.println("doSomething : " + str);
	}

}
