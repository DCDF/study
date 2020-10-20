package com.hammer.principle.interface_segregation_principle.a4_2.bad;

import com.hammer.principle.interface_segregation_principle.a4_2.bad.imp.IPettyGirl_bad;

public class PettyGirl implements IPettyGirl_bad {

	private String name = "";

	public PettyGirl(String _name) {
		this.name = _name;
	}

	@Override
	public void goodLooking() {
		System.err.println(name + " good");
	}

	@Override
	public void niceFigure() {
		System.err.println(name + " nice");
	}

	@Override
	public void grareTemperament() {
		System.err.println(name + " grate");
	}

}
