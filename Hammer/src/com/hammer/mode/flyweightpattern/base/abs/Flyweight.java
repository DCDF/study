package com.hammer.mode.flyweightpattern.base.abs;

public abstract class Flyweight {
	// 内部状态
	private String intrinsic;

	// 外部状态
	protected final String Extrinsic;

	// 要求亨元角色必须接受外部状态
	public Flyweight(String extrinsic) {
		Extrinsic = extrinsic;
	}

	// 业务逻辑
	public abstract void operate();

	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
	
	
}
