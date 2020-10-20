package com.hammer.principle.interface_segregation_principle.a4_2.bad.imp;

public interface IPettyGirl_bad {
	
	//臃肿了,区分为外形美女(脸蛋,身材,目前审美观没变的情况下不需要继续拆了,不用为了设计而设计)和气质美女
	//面貌
	public void goodLooking();

	//身材
	public void niceFigure();

	//气质
	public void grareTemperament();
}
