package com.parapharma.analytics;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class ReadDataFromFile implements ISymptomReader {

	private String filepath;
	private ArrayList<String> contenu;
	
	public ReadDataFromFile() {
	}
	
	public ReadDataFromFile(String filepath) {
		this.filepath = filepath;
	}
	
	public String getFilepath() {
		return this.filepath;
	}
	
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	
	public List<String> getSymptoms() {
		return this.contenu;
	}
	
	public void readFile() {
		contenu = new ArrayList<String>();
		
		if (this.getFilepath() != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					contenu.add(line);
					line = reader.readLine();
				}
				reader.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	@Override
	public String toString() {
		String s = "";
		for (String a : this.getSymptoms()) {
			s = s.concat(a + "\n"); 
		}
		return String.format("%s%n%s", "les symptoms dans le fichier",  s);
	}
	
}
