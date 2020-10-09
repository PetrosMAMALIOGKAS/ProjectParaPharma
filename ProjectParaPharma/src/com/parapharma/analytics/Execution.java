package com.parapharma.analytics;

import java.util.ArrayList;

public class Execution {
	public static void main(String[] args) {
		ReadDataFromFile a = new ReadDataFromFile();
		System.out.println("paoka");
		ArrayList<String> symp = new ArrayList<String>();
		symp.add("filer");
		symp.add("lol");
		symp.add("lol");
		SymptomAnalyzer tmp = new SymptomAnalyzer(symp);
		tmp.afficheresultat(tmp.getsymptoms());
		tmp.doublonEliminer();
		tmp.countFrequencies(tmp.getsymptoms());
		tmp.afficheresultat1(tmp.getOccurance());
	}
	
}
