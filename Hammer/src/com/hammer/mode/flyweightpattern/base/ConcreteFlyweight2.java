package com.hammer.mode.flyweightpattern.base;

import com.hammer.mode.flyweightpattern.base.abs.Flyweight;

public class ConcreteFlyweight2 extends Flyweight {

	public ConcreteFlyweight2(String extrinsic) {
		super(extrinsic);
	}

	// 根据外部状态进行逻辑处理
	@Override
	public void operate() {
		//业务逻辑
	}

}
