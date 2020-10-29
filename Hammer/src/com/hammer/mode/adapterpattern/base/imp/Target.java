package com.hammer.mode.adapterpattern.base.imp;

//目标角色:是一个已经在正式运行的角色,不可能去修改,只能想办法去实现接口中的方法
public interface Target {
	// 目标角色有自己的方法
	public void request();
}
