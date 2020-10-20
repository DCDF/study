package com.hammer.principle.liskov_substitution_principle;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Son son = new Son();
		son.change(new HashMap<>());
	}
}
