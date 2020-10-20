package com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2_2.bad;

public class InstallSoftware {
	public void installWizard(Wizard wizard) {
		int first = wizard.first();
		if (first > 50) {
			int second = wizard.second();
			if (second > 50) {
				int third = wizard.third();
				if (third > 50) {
					wizard.first();
				}
			}
		}
	}
}
