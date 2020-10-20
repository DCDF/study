package com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2.bad;

import java.util.List;

public class GroupLeader {
	public void listGirl(List<Girl> girlList) {
		System.err.println("count:" + girlList.size());
	}
}
