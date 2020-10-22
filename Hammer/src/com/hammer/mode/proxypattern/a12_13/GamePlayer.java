package com.hammer.mode.proxypattern.a12_13;

import com.hammer.mode.proxypattern.a12_13.imp.IGamePlayer;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	private IGamePlayer proxy = null;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String name, String pwd) {
		if (this.proxy == null) {
			System.err.println("请使用指定代理访问");
		} else {
			System.err.println(name + " 尝试登陆." + this.name + " 登陆成功");
		}
	}

	@Override
	public void killBoss() {
		if (this.proxy == null) {
			System.err.println("请使用指定代理访问");
		} else {
			System.err.println(this.name + " 打怪");
		}
	}

	@Override
	public void upgrade() {
		if (this.proxy == null) {
			System.err.println("请使用指定代理访问");
		} else {
			System.err.println(this.name + " 升级");
		}
	}

	// 找到自己的代理
	@Override
	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return proxy;
	}

}
