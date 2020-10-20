package com.hammer.mode.builderpattern;

import com.hammer.mode.builderpattern.abs.Builder;
import com.hammer.mode.builderpattern.sub.ConcreateProduce;

public class Director {
	private Builder builder = new ConcreateProduce();

	public Produce getProduceA() {
		builder.setPart();
		// 设置不同零件,产生不同产品
		return builder.buildProduce();
	}
}
