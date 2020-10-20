package com.hammer.mode.proxypattern.a12_1;

import com.hammer.mode.proxypattern.a12_1.imp.IGamePlayer;

public class Client {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("张三");
		System.err.println("开始时间:" + System.currentTimeMillis());
		player.login("zhangsan", "123456");
		player.killBoss();
		player.upgrade();
		System.err.println("结束时间:" + System.currentTimeMillis());
	}
}
