package com.hammer.mode.factorypattern.a8_4_2;

import com.hammer.mode.factorypattern.a8_4_2.imp.Human;

public class NvWa {
	public static void main(String[] args) {
		//多工厂模式,产品类和创建类对应,好处为创建类职责清晰,结构简单
		//不易于维护和扩展,加一个产品,需要加一个创建者
		//使用中一般增加协调类,避免避免调用者与各个子工厂交流,封装子工厂,提供统一接口
		Human whitePeople = new WhiteHumanFactory().createHuman();
		whitePeople.getColor();
		whitePeople.talk();
		Human blackPeople = new BlackHumanFactory().createHuman();
		blackPeople.getColor();
		blackPeople.talk();
		Human yellowPeople = new YellowHumanFactory().createHuman();
		yellowPeople.getColor();
		yellowPeople.talk();
	}
}
