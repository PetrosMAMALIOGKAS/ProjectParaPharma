package com.parapharma.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilterReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestAnalyticsCounter {
  
	private static final String FilePath = "symptoms.txt";
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		ArrayList<String>result = new ArrayList<>();
		
		try {
			BufferedReader br = null;
		    FileReader filereader = null;
			
			
			filereader = new FileReader(FilePath);
			br = new BufferedReader(filereader);
			String Line = br.readLine();
			
			while (Line != null) {
				result.add(Line);
				Line = br.readLine();
			}
			for (String r : result) {
				System.out.println(r);
				
				
			}
		}catch(Exception e) {
			System.out.println("Problème de fichier");
		}
		int frequencerash = Collections.frequency(result, "rash");
		int frequencefever = Collections.frequency(result, "fever");
		int frequencedialetedpupils = Collections.frequency(result, "dialated pupils");
		int frequencecough = Collections.frequency(result, "cough");
		int frequenceinflamation = Collections.frequency(result, "inflamation");
		
		
		System.out.println("Il y a "+ frequencerash + "références au symptôme 'rash'");
		System.out.println("Il y a "+ frequencefever + "références au symptôme 'fever'");
		System.out.println("Il y a "+ frequencedialetedpupils + "références au symptôme 'dialated pupils'");
		System.out.println("Il y a "+ frequencecough + "références au symptôme 'cough'");
		System.out.println("Il y a "+ frequenceinflamation + "références au symptôme 'inflamation'");
		
	}

}
