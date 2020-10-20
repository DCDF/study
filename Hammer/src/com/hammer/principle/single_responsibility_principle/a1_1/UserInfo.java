package com.hammer.principle.single_responsibility_principle.a1_1;

import com.hammer.principle.single_responsibility_principle.a1_1.imp.IUserBiz;
import com.hammer.principle.single_responsibility_principle.a1_1.imp.IUserBo;

public class UserInfo implements IUserBo, IUserBiz {

	@Override
	public String getUserId() {
		return null;
	}

	@Override
	public void setUserId(String userId) {

	}

	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public void setPassword(String password) {

	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setName(String name) {

	}

	@Override
	public void deleteUser(IUserBo bo) {
		
	}

}
