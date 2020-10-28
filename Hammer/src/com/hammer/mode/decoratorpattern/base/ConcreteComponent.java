package com.hammer.mode.decoratorpattern.base;

import com.hammer.mode.decoratorpattern.base.imp.Component;

public class ConcreteComponent extends Component {

	// 具体实现
	@Override
	public void operate() {
		System.out.println("do Something");
	}

}
