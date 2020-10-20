package com.hammer.principle.liskov_substitution_principle;

import java.util.Collection;
import java.util.Map;

public class Father {
	public Collection change(Map map) {
		System.err.println("父类方法");
		return map.values();
	}
}
