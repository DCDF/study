package com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2.better;

import java.util.List;

import com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2.bad.Girl;

public class GroupLeader {
	private List<Girl> girls = null;

	public GroupLeader(List<Girl> _girls) {
		this.girls = _girls;
	}

	public void listGirls() {
		System.err.println("count:" + girls.size());
	}
}
