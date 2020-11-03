package com.hammer.mode.observerpattern.a22_20jdkbase;

import java.util.Observable;

public class HanFeiZi extends Observable {

	public void haveBreakfast() {
		System.err.println("开饭");
		super.setChanged();
		super.notifyObservers();
	}

	public void haveFun() {
		System.err.println("开耍");
		super.setChanged();
		super.notifyObservers();
	}

}
