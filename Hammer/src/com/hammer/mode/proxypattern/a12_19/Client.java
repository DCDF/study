package com.hammer.mode.proxypattern.a12_19;

import com.hammer.mode.proxypattern.a12_13.imp.IGamePlayer;

public class Client {

	public static void main(String[] args) {
		// 代理也有自己的个性(计费,给多个玩家代练等,执行扩展)
		IGamePlayer player = new GamePlayer("张三");
		IGamePlayer proxy = player.getProxy();
		System.err.println("开始时间:" + System.currentTimeMillis());
		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.err.println("结束时间:" + System.currentTimeMillis());
	}
}
