package com.hammer.principle.interface_segregation_principle.a4_2.bad.imp;

public abstract class AbstractSearcher {
	protected IPettyGirl_bad girl = null;

	public AbstractSearcher(IPettyGirl_bad _girl) {
		this.girl = _girl;
	}

	public abstract void show();
}
