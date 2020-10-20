package com.hammer.principle.interface_segregation_principle.a4_2.bad;

import com.hammer.principle.interface_segregation_principle.a4_2.bad.imp.AbstractSearcher;
import com.hammer.principle.interface_segregation_principle.a4_2.bad.imp.IPettyGirl_bad;

public class Searcher extends AbstractSearcher {

	public Searcher(IPettyGirl_bad _girl) {
		super(_girl);
	}

	@Override
	public void show() {
		girl.goodLooking();
		girl.niceFigure();
		girl.grareTemperament();
	}

}
