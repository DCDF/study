package com.hammer.mode.proxypattern.a12_2;

import com.hammer.mode.proxypattern.a12_2.imp.IGamePlayer;

public class Client {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("张三");
		IGamePlayer proxy = new GamePlayerProxy(player);
		System.err.println("开始时间:" + System.currentTimeMillis());
		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.err.println("结束时间:" + System.currentTimeMillis());
	}
}
