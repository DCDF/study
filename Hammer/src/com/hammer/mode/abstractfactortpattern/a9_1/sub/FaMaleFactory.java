package com.hammer.mode.abstractfactortpattern.a9_1.sub;

import com.hammer.mode.abstractfactortpattern.a9_1.inter.Human;
import com.hammer.mode.abstractfactortpattern.a9_1.inter.HumanFactory;

public class FaMaleFactory implements HumanFactory {

	@Override
	public Human createWhiteHuman() {
		return new FeMaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new FeMaleBlackHuman();
	}

	@Override
	public Human createYellowHuman() {
		return new FeMaleYellowHuman();
	}

}
