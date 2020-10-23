package com.hammer.mode.prototypepattern.a13_11;

import java.util.ArrayList;
import java.util.List;

public class Thing implements Cloneable {
	private List<String> list = new ArrayList<String>();

	public List<String> getList() {
		return list;
	}

	public void setList(String str) {
		this.list.add(str);
	}

	@Override
	protected Thing clone() {
		Thing obj = null;
		try {
			obj = (Thing) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
