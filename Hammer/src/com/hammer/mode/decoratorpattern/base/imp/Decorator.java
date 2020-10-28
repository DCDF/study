package com.hammer.mode.decoratorpattern.base.imp;

public abstract class Decorator extends Component {
	private Component component = null;

	// 通过构建函数传递被修饰者
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operate() {
		this.component.operate();
	}

}
