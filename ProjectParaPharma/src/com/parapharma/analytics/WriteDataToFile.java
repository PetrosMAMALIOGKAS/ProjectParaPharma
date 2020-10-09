package com.parapharma.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteDataToFile {
	private ArrayList<String> symptomsPourEcrire;
	private ArrayList<Integer> occurancesPourEcrire;
	
	public WriteDataToFile(ArrayList<String> s, ArrayList<Integer> i ) {
		this.symptomsPourEcrire   = s;
		this.occurancesPourEcrire = i;
	}

	public ArrayList<String> getSymptomsPourEcrire() {
		return this.symptomsPourEcrire;
	}

	public void setSymptomsPourEcrire(ArrayList<String> symptomsPourEcrire) {
		this.symptomsPourEcrire = symptomsPourEcrire;
	}

	public ArrayList<Integer> getOccurancesPourEcrire() {
		return this.occurancesPourEcrire;
	}

	public void setOccurancesPourEcrire(ArrayList<Integer> occurancesPourEcrire) {
		this.occurancesPourEcrire = occurancesPourEcrire;
	}
	
	public void writeDansLefichier() throws Exception {
		FileWriter writer = new FileWriter ("result.out");
		int listLength = this.getSymptomsPourEcrire().size();
		System.out.println(listLength);
		for (int i = 0; i <= listLength -1; i++) {
System.out.println(this.getSymptomsPourEcrire().get(i));
			writer.write(this.getSymptomsPourEcrire().get(i) + " " + 
		                  this.getOccurancesPourEcrire().get(i) + "\n");
		}
		
		writer.close();
		System.out.println("Ok written");
	}
	
}