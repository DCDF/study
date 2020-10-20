package com.hammer.mode.factorypattern.a8_4;

import com.hammer.mode.factorypattern.a8_1.imp.Human;

public class NvWa {
	public static void main(String[] args) {
		
		//简单工厂模式,静态工厂模式.缺点,不易扩展,不符合开闭原则,但是常用,实用
		Human whitePeople = HumanFactory.createHuman(WhitePeople.class);
		whitePeople.getColor();
		whitePeople.talk();
		Human blackPeople = HumanFactory.createHuman(WhitePeople.class);
		blackPeople.getColor();
		blackPeople.talk();
		Human yellowPeople = HumanFactory.createHuman(WhitePeople.class);
		yellowPeople.getColor();
		yellowPeople.talk();
	}
}
