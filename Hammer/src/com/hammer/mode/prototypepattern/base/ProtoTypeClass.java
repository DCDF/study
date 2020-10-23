package com.hammer.mode.prototypepattern.base;

public class ProtoTypeClass implements Cloneable {
	@Override
	protected ProtoTypeClass clone(){
		ProtoTypeClass obj = null;
		try {
			obj = (ProtoTypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: 异常处理
		}
		return obj;
	}
}
