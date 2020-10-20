package com.hammer.mode.proxypattern.a12_2;

import com.hammer.mode.proxypattern.a12_2.imp.IGamePlayer;

public class GamePlayer implements IGamePlayer {

	private String name = "";

	// 通过构造参数传递名字
	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String name, String pwd) {
		System.err.println("用户名:" + name + " 的用户登录," + this.name + " 登录成功");
	}

	@Override
	public void killBoss() {
		System.err.println(this.name + " 打怪");

	}

	@Override
	public void upgrade() {
		System.err.println(this.name + " 升了一级");
	}

}
