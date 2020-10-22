package com.hammer.mode.proxypattern.a12_10;

import com.hammer.mode.proxypattern.a12_10.imp.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;

	// 被代练对象
	public GamePlayerProxy(String name) {
		try {
			this.gamePlayer = new GamePlayer(this, name);
		} catch (Exception e) {
			// TODO 异常处理
		}
	}

	@Override
	public void login(String name, String pwd) {
		this.gamePlayer.login(name, pwd);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

}
