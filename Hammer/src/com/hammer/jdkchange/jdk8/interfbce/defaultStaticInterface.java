package com.hammer.jdkchange.jdk8.interfbce;

public interface defaultStaticInterface {
	// 提供默认实现的方法
	public default int getId() {
		return 1;
	};

	// 提供静态方法
	public static int getStatic() {
		return 1;
	}
}
