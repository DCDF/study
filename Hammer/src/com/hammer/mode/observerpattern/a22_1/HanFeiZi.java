package com.hammer.mode.observerpattern.a22_1;

import javax.sound.midi.SysexMessage;

import com.hammer.mode.observerpattern.a22_1.imp.IHanFeiZi;

public class HanFeiZi implements IHanFeiZi {

	private boolean isHaveingBreakfast = false;

	private boolean isHavingFun = false;

	@Override
	public void haveBreakfast() {
		System.err.println("开饭");
		this.isHaveingBreakfast = true;
	}

	@Override
	public void haveFun() {
		System.err.println("开耍");
		this.isHavingFun = true;
	}

	public boolean isHaveingBreakfast() {
		return isHaveingBreakfast;
	}

	public void setHaveingBreakfast(boolean isHaveingBreakfast) {
		this.isHaveingBreakfast = isHaveingBreakfast;
	}

	public boolean isHavingFun() {
		return isHavingFun;
	}

	public void setHavingFun(boolean isHavingFun) {
		this.isHavingFun = isHavingFun;
	}

}
