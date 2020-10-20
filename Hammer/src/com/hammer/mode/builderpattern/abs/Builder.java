package com.hammer.mode.builderpattern.abs;

import com.hammer.mode.builderpattern.Produce;

public abstract class Builder {
	
	//设置产品的不同部分,已获得不同产品
	public abstract void setPart();

	//建造产品
	public abstract Produce buildProduce();
}
