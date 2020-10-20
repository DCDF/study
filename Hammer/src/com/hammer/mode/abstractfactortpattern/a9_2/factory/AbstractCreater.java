package com.hammer.mode.abstractfactortpattern.a9_2.factory;

import com.hammer.mode.abstractfactortpattern.a9_2.abs.AbstractProduceA;
import com.hammer.mode.abstractfactortpattern.a9_2.abs.AbstractProduceB;

public abstract class AbstractCreater {
	public abstract AbstractProduceA createProduceA();

	public abstract AbstractProduceB createProduceB();
}
