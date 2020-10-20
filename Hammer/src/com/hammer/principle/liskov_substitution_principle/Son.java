package com.hammer.principle.liskov_substitution_principle;

import java.util.Collection;
import java.util.Map;

public class Son extends Father {
	@Override
	public Collection change(Map map) {
		return super.change(map);
	}
}
