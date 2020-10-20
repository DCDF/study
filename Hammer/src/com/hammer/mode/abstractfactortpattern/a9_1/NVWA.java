package com.hammer.mode.abstractfactortpattern.a9_1;

import com.hammer.mode.abstractfactortpattern.a9_1.inter.Human;
import com.hammer.mode.abstractfactortpattern.a9_1.inter.HumanFactory;
import com.hammer.mode.abstractfactortpattern.a9_1.sub.FaMaleFactory;
import com.hammer.mode.abstractfactortpattern.a9_1.sub.MaleFactory;

public class NVWA {
	public static void main(String[] args) {
		HumanFactory maleFactory = new MaleFactory();
		HumanFactory femaleFactory = new FaMaleFactory();
		Human whiteMale = maleFactory.createWhiteHuman();
		Human whiteFeMale = femaleFactory.createWhiteHuman();
		System.err.println("create white male");
		whiteMale.getColor();
		whiteMale.getSex();
		whiteMale.getTalk();
		System.err.println("create white female");
		whiteFeMale.getColor();
		whiteFeMale.getSex();
		whiteFeMale.getTalk();
	}
}
