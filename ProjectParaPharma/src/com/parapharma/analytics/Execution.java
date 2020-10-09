package com.parapharma.analytics;

import java.io.IOException;
import java.util.ArrayList;

public class Execution {
	public static void main(String[] args) throws Exception {
		ArrayList<String> sym = new ArrayList<String>();
		ArrayList<Integer> oc = new ArrayList<Integer>();
		sym.add("fever");
		oc.add(1);
		sym.add("dialated pupils");
		oc.add(3);
		sym.add("dry mouth");
		oc.add(4);
		sym.add("inflamation");
		oc.add(1);
		sym.add("tremor");
		oc.add(3);
		sym.add("stomach pain");
		oc.add(1);
		
		String cheminDuFichier = "C:\\Users\\Utilisateur\\eclipse-workspace\\ProjectParaPharma\\ProjectParaPharma\\symptoms.txt";
		ReadDataFromFile reader = new ReadDataFromFile(cheminDuFichier);
		reader.readFile();
		System.out.println(reader.toString());
	    WriteDataToFile writer = new WriteDataToFile(sym, oc);
	    writer.writeDansLefichier();
		
	}
	
}
