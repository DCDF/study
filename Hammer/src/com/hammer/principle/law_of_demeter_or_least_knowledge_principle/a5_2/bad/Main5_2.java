package com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2.bad;

public class Main5_2 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.command(new GroupLeader());
	}
}
