package com.hammer.mode.templatemethod;

import com.hammer.mode.templatemethod.abs.AbstractClass;
import com.hammer.mode.templatemethod.sub.ConcreateClass1;
import com.hammer.mode.templatemethod.sub.ConcreateClass2;

public class Main {
	public static void main(String[] args) {
		AbstractClass c1 = new ConcreateClass1();
		AbstractClass c2 = new ConcreateClass2();
		c1.templateMethod();
		c2.templateMethod();
	}
}
