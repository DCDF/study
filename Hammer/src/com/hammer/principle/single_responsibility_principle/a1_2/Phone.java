package com.hammer.principle.single_responsibility_principle.a1_2;

import com.hammer.principle.single_responsibility_principle.a1_2.imp.IConnectionManager;
import com.hammer.principle.single_responsibility_principle.a1_2.imp.IDataTransfer;

public class Phone implements IConnectionManager, IDataTransfer {

	//面向接口编程,如果要强行满足单一原则,就会多一个connectionmanager类和datatransfer类,强耦合,增加复杂度减少可读性
	//原则是死的,人是活的
	@Override
	public void chat(IConnectionManager con) {

	}

	@Override
	public void dial(String phoneNum) {

	}

	@Override
	public void hangup() {

	}

}
