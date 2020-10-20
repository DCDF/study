package com.hammer.mode.abstractfactortpattern.a9_2.factory;

import com.hammer.mode.abstractfactortpattern.a9_2.abs.AbstractProduceA;
import com.hammer.mode.abstractfactortpattern.a9_2.abs.AbstractProduceB;
import com.hammer.mode.abstractfactortpattern.a9_2.sub.ProduceA1;
import com.hammer.mode.abstractfactortpattern.a9_2.sub.ProduceB1;

public class Creater1 extends AbstractCreater{

	@Override
	public AbstractProduceA createProduceA() {
		return new ProduceA1();
	}

	@Override
	public AbstractProduceB createProduceB() {
		return new ProduceB1();
	}

}
