package com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2_2.better;

import java.util.Random;

public class Wizard {
	private Random random = new Random(System.currentTimeMillis());

	private int first() {
		System.err.println("first");
		return random.nextInt(100);
	}

	private int second() {
		System.err.println("second");
		return random.nextInt(100);
	}

	private int third() {
		System.err.println("third");
		return random.nextInt(100);
	}

	public void install() {
		int first = this.first();
		if (first > 50) {
			int second = this.second();
			if (second > 50) {
				int third = this.third();
				if (third > 50) {
					first();
				}
			}
		}
	}
}
