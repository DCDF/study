package com.hammer.mode.factorypattern.a8_4;

import com.hammer.mode.factorypattern.a8_1.imp.Human;

public class HumanFactory {

	public static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;

		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.err.println("HumanFactory生产出错");
		}
		return (T) human;
	}

}
