package com.hammer.principle.single_responsibility_principle.a1_3;

import com.hammer.principle.single_responsibility_principle.a1_1.imp.IUserBo;

public interface IUserManager_bad {
	public void changeUser(IUserBo bo, String... changeOptions);
}
