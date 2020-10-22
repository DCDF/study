package com.hammer.mode.proxypattern.a12_10;

import com.hammer.mode.proxypattern.a12_10.imp.IGamePlayer;

public class Client {

	public static void main(String[] args) {
		// 普通代理,调用者只需要知道代理存在就可以,不用知道代理了谁
		//屏蔽了真实角色的变更对高层模块的影响,真实的主题角色想怎么修改就怎么修改
		IGamePlayer proxy = new GamePlayerProxy("张三");
		System.err.println("开始时间:" + System.currentTimeMillis());
		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.err.println("结束时间:" + System.currentTimeMillis());
	}
}
