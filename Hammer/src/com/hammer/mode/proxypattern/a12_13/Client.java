package com.hammer.mode.proxypattern.a12_13;

import com.hammer.mode.proxypattern.a12_13.imp.IGamePlayer;

public class Client {
	// 强制代理(透明代理)
	public static void main(String[] args) {
//		one();//无法访问
//		two();//无法访问
		three();
	}

	public static void one() {
		// 直接用真实角色访问
		IGamePlayer player = new GamePlayer("张三");
		System.err.println("开始游戏:" + System.currentTimeMillis());
		player.login("zhangsan", "123456");
		player.killBoss();
		player.upgrade();
		System.err.println("结束游戏:" + System.currentTimeMillis());

		// 请使用指定代理访问
	}

	public static void two() {
		// 自己new一个代理访问
		IGamePlayer player = new GamePlayer("张三");
		IGamePlayer proxy = new GamePlayerProxy(player);
		System.err.println("开始游戏:" + System.currentTimeMillis());
		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.err.println("结束游戏:" + System.currentTimeMillis());

		// 请使用指定代理访问
	}

	public static void three() {
		// 获得指定的代理
		IGamePlayer player = new GamePlayer("张三");
		IGamePlayer proxy = player.getProxy();
		System.err.println("开始游戏:" + System.currentTimeMillis());
		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.err.println("结束游戏:" + System.currentTimeMillis());

		// 可以访问
	}
}
