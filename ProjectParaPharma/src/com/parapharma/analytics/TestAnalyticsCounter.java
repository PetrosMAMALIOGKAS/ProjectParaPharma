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
			System.out.println("Probl�me de fichier");
		}
		int frequencerash = Collections.frequency(result, "rash");
		int frequencefever = Collections.frequency(result, "fever");
		int frequencedialetedpupils = Collections.frequency(result, "dialated pupils");
		int frequencecough = Collections.frequency(result, "cough");
		int frequenceinflamation = Collections.frequency(result, "inflamation");
		
		
		System.out.println("Il y a "+ frequencerash + "r�f�rences au sympt�me 'rash'");
		System.out.println("Il y a "+ frequencefever + "r�f�rences au sympt�me 'fever'");
		System.out.println("Il y a "+ frequencedialetedpupils + "r�f�rences au sympt�me 'dialated pupils'");
		System.out.println("Il y a "+ frequencecough + "r�f�rences au sympt�me 'cough'");
		System.out.println("Il y a "+ frequenceinflamation + "r�f�rences au sympt�me 'inflamation'");
		
	}

}
