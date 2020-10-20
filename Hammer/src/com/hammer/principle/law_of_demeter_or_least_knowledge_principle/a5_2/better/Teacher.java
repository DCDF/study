package com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2.better;

public class Teacher {
	public void command(GroupLeader leader) {
		leader.listGirls();
	}
}
