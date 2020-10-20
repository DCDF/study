package com.hammer.principle.interface_segregation_principle.a4_2.bad;

import com.hammer.principle.interface_segregation_principle.a4_2.bad.imp.AbstractSearcher;
import com.hammer.principle.interface_segregation_principle.a4_2.bad.imp.IPettyGirl_bad;

public class Main4_2 {
	public static void main(String[] args) {
		IPettyGirl_bad girl = new PettyGirl("1");
		AbstractSearcher searcher = new Searcher(girl);
		searcher.show();
	}
}
