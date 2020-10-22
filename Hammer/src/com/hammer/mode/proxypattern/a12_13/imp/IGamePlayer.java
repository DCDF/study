package com.hammer.mode.proxypattern.a12_13.imp;

public interface IGamePlayer {

	// 登录
	public void login(String name, String pwd);

	// 杀怪
	public void killBoss();

	// 升级
	public void upgrade();

	// 每个人都可以找一下自己的代理
	public IGamePlayer getProxy();
}
