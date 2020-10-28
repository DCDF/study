package com.hammer.mode.chainofresponsibilitypattern.base;

import com.hammer.mode.chainofresponsibilitypattern.base.imp.Handler;

public class Client {
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler1();
		Handler h3 = new ConcreteHandler1();
		// 设置链中的阶段顺序 1->2->3
		h1.setNext(h2);
		h2.setNext(h3);
		Response response = h1.HandleMessage(new Request());
		//实际应用中,一般会有一个封装类对责任模式进行封装,也就是特带这个Client类,直接返回链中第一个处理者
	}
}
