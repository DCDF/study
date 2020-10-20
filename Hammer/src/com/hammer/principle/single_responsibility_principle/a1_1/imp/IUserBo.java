package com.hammer.principle.single_responsibility_principle.a1_1.imp;

public interface IUserBo {
	String userId = "";
	String password = "";
	String name = "";

	public String getUserId();

	public void setUserId(String userId);

	public String getPassword();

	public void setPassword(String password);

	public String getName();

	public void setName(String name);
}
