package com.hammer.mode.proxypattern.a12_13;

import com.hammer.mode.proxypattern.a12_13.imp.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;

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

	// 代理的代理暂时没有,就是自己
	@Override
	public IGamePlayer getProxy() {
		return null;
	}

}
