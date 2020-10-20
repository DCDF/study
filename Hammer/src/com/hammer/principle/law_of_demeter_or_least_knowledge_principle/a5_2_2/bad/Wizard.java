package com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2_2.bad;

import java.util.Random;

public class Wizard {
	private Random random = new Random(System.currentTimeMillis());

	public int first() {
		System.err.println("first");
		return random.nextInt(100);
	}

	public int second() {
		System.err.println("second");
		return random.nextInt(100);
	}

	public int third() {
		System.err.println("third");
		return random.nextInt(100);
	}
}
