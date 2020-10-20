package com.hammer.principle.law_of_demeter_or_least_knowledge_principle.a5_2_2.bad;

public class Main5_2_2bad {
	public static void main(String[] args) {
		InstallSoftware w = new InstallSoftware();
		w.installWizard(new Wizard());
	}
}
