package com.hammer.friend.singel.one.save;

import java.util.ArrayList;
import java.util.List;

import com.hammer.friend.singel.one.role.Role;

public class SaveData {
	// TODO 所有set方法通过服务器初始化时加载的数据缓存起来
	private List<Role> roleSaveData = new ArrayList<>();

	public List<Role> getRoleSaveData() {
		return roleSaveData;
	}

	public void setRoleSaveData(List<Role> roleSaveData) {
		this.roleSaveData = roleSaveData;
	}

}
