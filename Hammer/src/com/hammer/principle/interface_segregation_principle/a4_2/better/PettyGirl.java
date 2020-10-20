package com.hammer.principle.interface_segregation_principle.a4_2.better;

import com.hammer.principle.interface_segregation_principle.a4_2.better.imp.IGoodBodyGirl;
import com.hammer.principle.interface_segregation_principle.a4_2.better.imp.IGreateTemperament;

public class PettyGirl implements IGoodBodyGirl, IGreateTemperament {

	private String name = "";

	public PettyGirl(String _name) {
		this.name = _name;
	}

	@Override
	public void grateTemperament() {
		System.err.println(name + " grete");
	}

	@Override
	public void goodLooking() {
		System.err.println(name + " good");

	}

	@Override
	public void niceFigure() {
		System.err.println(name + " nice");

	}

}
