package com.hammer.mode.strategypattern;

import com.hammer.mode.strategypattern.imp.Strategy;

//封装角色(重点,和代理模式区别就在于不是实现同一个接口)
public class Context {
	// 抽象策略
	private Strategy strategy = null;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	// 封装后的策略方法
	public void doSomething() {
		this.strategy.doSomething();
	}
}
