package com.hammer.mode.flyweightpattern.base;

import java.util.HashMap;

import com.hammer.mode.flyweightpattern.base.abs.Flyweight;

public class FlyweightFactory {

	// 池容器
	private static HashMap<String, Flyweight> pool = new HashMap<>();

	// 亨元模式
	public static Flyweight getFlyweight(String Extrinsic) {
		Flyweight flyweight = null;

		if (pool.containsKey(Extrinsic)) {
			flyweight = pool.get(Extrinsic);
		} else {
			flyweight = new ConcreteFlyweight1(Extrinsic);
			pool.put(Extrinsic, flyweight);
		}
		return flyweight;
	}
}
