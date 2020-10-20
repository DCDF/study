package com.hammer.principle.single_responsibility_principle.a1_1;

import com.hammer.principle.single_responsibility_principle.a1_1.imp.IUserBiz;
import com.hammer.principle.single_responsibility_principle.a1_1.imp.IUserBo;

//单一职责:有且仅有一个原因引起类的变化
public class Main1_1 {
	public static void main(String[] args) {
		UserInfo user = new UserInfo();
		// 我要赋值了,我就认为它是一个纯粹的bo
		IUserBo userbo = (IUserBo) user;
		userbo.setUserId("001");
		userbo.setPassword("111");
		userbo.setName("1");
		// 我要执行操作了,我就认为它是一个业务逻辑类
		IUserBiz userbiz = (IUserBiz) user;
		userbiz.deleteUser(userbo);
	}
}
