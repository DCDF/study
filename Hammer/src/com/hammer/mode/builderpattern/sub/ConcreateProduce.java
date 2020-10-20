package com.hammer.mode.builderpattern.sub;

import com.hammer.mode.builderpattern.Produce;
import com.hammer.mode.builderpattern.abs.Builder;

public class ConcreateProduce extends Builder {

	//有几个产品类就有几个具体的建造者
	private Produce produce = new Produce();

	@Override
	public void setPart() {
		
		//产品类内的逻辑处理
	}

	@Override
	public Produce buildProduce() {
		return produce;
	}

}
