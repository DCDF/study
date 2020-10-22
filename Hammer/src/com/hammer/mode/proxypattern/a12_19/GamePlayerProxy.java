package com.hammer.mode.proxypattern.a12_19;

import com.hammer.mode.proxypattern.a12_13.imp.IGamePlayer;
import com.hammer.mode.proxypattern.a12_19.imp.IProxy;

public class GamePlayerProxy implements IGamePlayer, IProxy {

	private IGamePlayer player = null;

	public GamePlayerProxy(IGamePlayer player) {
		this.player = player;
	}

	@Override
	public void login(String name, String pwd) {
		this.player.login(name, pwd);
	}

	@Override
	public void killBoss() {
		this.player.killBoss();
	}

	@Override
	public void upgrade() {
		this.player.upgrade();
		this.count();
	}

	@Override
	public IGamePlayer getProxy() {
		return this;
	}

	@Override
	public void count() {
		System.err.println("升级费用100块");
	}

}
