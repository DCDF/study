package com.hammer.mode.prototypepattern.a13_12;

import java.util.ArrayList;

public class Thing implements Cloneable {
	private ArrayList<String> list = new ArrayList<String>();

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(String str) {
		this.list.add(str);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Thing clone() {
		Thing obj = null;
		try {
			obj = (Thing) super.clone();
			//clone只拷贝本身,所以需要将类变量
			obj.list = (ArrayList<String>) this.list.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
