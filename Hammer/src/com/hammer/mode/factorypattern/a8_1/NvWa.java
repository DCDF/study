package com.hammer.mode.factorypattern.a8_1;

import com.hammer.mode.factorypattern.a8_1.imp.Human;

public class NvWa {
	public static void main(String[] args) {
		AbstractHumanFactory factory = new HumanFactory();
		Human whitePeople = factory.createHuman(WhitePeople.class);
		whitePeople.getColor();
		whitePeople.talk();
		Human blackPeople = factory.createHuman(BlackPeople.class);
		blackPeople.getColor();
		blackPeople.talk();
		Human yellowPeople = factory.createHuman(YellowPeople.class);
		yellowPeople.getColor();
		yellowPeople.talk();
	}
}
