package com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2.better;

import java.util.ArrayList;
import java.util.List;

import com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2.bad.Girl;

public class Main5_2 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		List<Girl> girls = new ArrayList<>();
		for(int i = 0;i<20;i++) {
			girls.add(new Girl());
		}
		GroupLeader leader = new GroupLeader(girls);
		teacher.command(leader);
	}
}
