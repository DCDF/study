package com.hammer.mode.factorypattern.a8_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Creater creater = new ConcreteCreater();
		Product product = creater.create(ConcreteProduct2.class);
		product.method2();

		List<Object> objList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();//参数化类型
		
	}
}
