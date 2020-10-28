package com.hammer.mode.chainofresponsibilitypattern.base;

import java.util.logging.Level;

import com.hammer.mode.chainofresponsibilitypattern.base.imp.Handler;

public class ConcreteHandler1 extends Handler {

	@Override
	protected Level getHandlerLevel() {
		// 设置自己的处理级别
		return null;
	}

	@Override
	protected Response echo(Request request) {
		// 完成处理逻辑
		return null;
	}

}
