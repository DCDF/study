package com.hammer.mode.abstractfactortpattern.a9_2.factory;

import com.hammer.mode.abstractfactortpattern.a9_2.abs.AbstractProduceA;
import com.hammer.mode.abstractfactortpattern.a9_2.abs.AbstractProduceB;
import com.hammer.mode.abstractfactortpattern.a9_2.sub.ProduceA2;
import com.hammer.mode.abstractfactortpattern.a9_2.sub.ProduceB2;

public class Creater2 extends AbstractCreater {

	@Override
	public AbstractProduceA createProduceA() {
		return new ProduceA2();
	}

	@Override
	public AbstractProduceB createProduceB() {
		return new ProduceB2();
	}

}
