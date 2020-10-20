package com.hammer.mode.factorypattern.a8_2;

public class ConcreteCreater extends Creater {

	@Override
	public <T extends Product> T create(Class<T> c) {
		Product product = null;

		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.err.println("创建失败:" + c.getName());
		}
		return (T) product;
	}

}
