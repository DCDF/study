package com.hammer.mode.proxypattern.a12_2;

import com.hammer.mode.proxypattern.a12_2.imp.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;

	// 被代练对象
	public GamePlayerProxy(IGamePlayer _gamePlayer) {
		this.gamePlayer = _gamePlayer;
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
