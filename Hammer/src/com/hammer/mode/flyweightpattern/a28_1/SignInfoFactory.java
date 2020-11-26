package com.hammer.mode.flyweightpattern.a28_1;

import java.util.HashMap;

public class SignInfoFactory {

	//
	private static HashMap<String, SignInfo> pool = new HashMap<>();

	@Deprecated
	public static SignInfo getSignInfo() {
		return new SignInfo();
	}

	public static SignInfo getSignInfo(String key) {
		// 设置返回对象
		SignInfo result = null;
		if (!pool.containsKey(key)) {
			System.out.println("创建新对象:" + key);
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		} else {
			result = pool.get(key);
			System.out.println("取得对象:" + key);
		}
		return result;
	}
}
