package com.hammer.mode.flyweightpattern.a28_1;

public class SignInfo4Pool extends SignInfo {
	//定义一个对象池提取的KEY值
	private String key;

	//构造函数获得相同标志
	public SignInfo4Pool(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
