package com.hammer.mode.proxypattern.a12_10;

import com.hammer.mode.proxypattern.a12_10.imp.IGamePlayer;

public class GamePlayer implements IGamePlayer {

	private String name = "";

	// 构造函数限制谁能创建对象,并同时传递名字
	public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
		// 具体怎么限制可自行扩展
		if (gamePlayer == null) {
			throw new Exception("不能创建真实角色 !");
		}
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
