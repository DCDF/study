package com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2.bad;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	public void command(GroupLeader leader) {
		List<Girl> list = new ArrayList<Girl>();//出现了非朋友类的调用
		for (int i = 0; i < 20; i++) {
			list.add(new Girl());
		}
		leader.listGirl(list);
	}
}
