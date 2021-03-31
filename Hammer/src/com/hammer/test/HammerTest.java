package com.hammer.test;

public class HammerTest {

	private Object obj = new Object();
	private String abc = "";
//	public static void main(String[] args) {
//		HammerTest test = new HammerTest();
//		
//		test.getCoreNum();
//	}

	/**
	 * 处理器核心数量
	 */
	public void getCoreNum() {
		int coreNum = Runtime.getRuntime().availableProcessors();
		System.out.println(coreNum + " 核处理器");
	}

	public void setStr(String str) {
		synchronized (abc) {
			this.abc = str;
		}
	}

	public String getStr() {
		synchronized (obj) {
			return abc;
		}
	}
}
