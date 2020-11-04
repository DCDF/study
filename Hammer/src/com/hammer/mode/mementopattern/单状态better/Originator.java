package com.hammer.mode.mementopattern.单状态better;

//发起人
public class Originator implements Cloneable {

	// 内部状态
	private String state = "";

	private Originator backUp;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void createMemento() {
		this.backUp = this.clone();
	}

	public void restoreMemento() {
		this.setState(this.backUp.getState());
	}

	@Override
	protected Originator clone() {
		try {
			return (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
