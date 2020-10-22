package com.hammer.mode.proxypattern.a12_22;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.hammer.mode.proxypattern.a12_1.GamePlayer;
import com.hammer.mode.proxypattern.a12_1.imp.IGamePlayer;

public class Client {
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("张三");
		InvocationHandler handler = new GamePlayerIH(player);
		System.err.println("开始:" + System.currentTimeMillis());

		ClassLoader cl = player.getClass().getClassLoader();

		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[] { IGamePlayer.class }, handler);

		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.err.println("结束:" + System.currentTimeMillis());
	}
}
