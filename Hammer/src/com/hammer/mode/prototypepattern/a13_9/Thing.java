package com.hammer.mode.prototypepattern.a13_9;

public class Thing implements Cloneable {

	public Thing() {
		System.out.println("构造函数被执行");
	}

	@Override
	protected Thing clone() {
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing;
	}
}
