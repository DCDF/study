package com.hammer.mode.abstractfactortpattern.a9_1.sub;

import com.hammer.mode.abstractfactortpattern.a9_1.inter.Human;
import com.hammer.mode.abstractfactortpattern.a9_1.inter.HumanFactory;

public class MaleFactory implements HumanFactory {

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

}
