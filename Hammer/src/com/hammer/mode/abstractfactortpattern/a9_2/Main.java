package com.hammer.mode.abstractfactortpattern.a9_2;

import com.hammer.mode.abstractfactortpattern.a9_2.abs.AbstractProduceA;
import com.hammer.mode.abstractfactortpattern.a9_2.abs.AbstractProduceB;
import com.hammer.mode.abstractfactortpattern.a9_2.factory.AbstractCreater;
import com.hammer.mode.abstractfactortpattern.a9_2.factory.Creater1;
import com.hammer.mode.abstractfactortpattern.a9_2.factory.Creater2;

public class Main {
	public static void main(String[] args) {
		AbstractCreater c1 = new Creater1();
		AbstractCreater c2 = new Creater2();

		AbstractProduceA a1 = c1.createProduceA();
		a1.doSomething();
		AbstractProduceB b1 = c1.createProduceB();
		b1.doSomething();
		AbstractProduceA a2 = c2.createProduceA();
		a2.doSomething();
		AbstractProduceB b2 = c2.createProduceB();
		b2.doSomething();
	}
}
