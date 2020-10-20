package com.hammer.principle.single_responsibility_principle.a1_2.imp;

public interface Iphone_bad {
	// 拨通
	public void dial(String phoneNum);

	// 通讯
	public void chat(Object obj);

	// 挂断
	public void hangup();

	// 拨通挂断和协议属于协议管理,通讯属于数据的传送
}
