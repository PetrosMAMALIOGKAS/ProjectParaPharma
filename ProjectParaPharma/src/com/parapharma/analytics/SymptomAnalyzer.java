package com.parapharma.analytics;


import java .util.ArrayList;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 
import java.util.*;
import java.util.Set;
import java.util.HashSet;


public class SymptomAnalyzer {
	
	private ArrayList<String> symptoms;
	private Set<String> doublonEliminer;
	private ArrayList<Integer> occurance = new ArrayList<Integer>(16);
	
	
	public SymptomAnalyzer(ArrayList<String> symptoms) {
		this.symptoms = symptoms;
		
	}
	public ArrayList<String> getsymptoms() {
		return symptoms;
	}


	public void setSymptoms(ArrayList<String> symptoms) {
		symptoms = symptoms;
		
		
		
	}
	
	public void doublonEliminer() {
		Set<String> listesymptomes = new HashSet<String>(symptoms);
		this.doublonEliminer = listesymptomes;
	}
	
	
	
	public void countFrequencies(ArrayList<String> symptoms) { 
		Set<String> listesymptomes = new HashSet<String>(symptoms);
	//longueur du set
	String[] newlist = new String[listesymptomes.size()];
	listesymptomes.toArray(newlist);
		
//boucle for 0 jusqu'à lonqueur de liste de symptome-1
		for (int i = 0; i <= newlist.length; i++) {
			for(String s: symptoms) {
				if (newlist[i].equals(s)) {
					occurance.set(i,(occurance.get(i)+1));
				}
			}
		
		}
	}
	
	
	public void afficheresultat1(ArrayList<Integer> occurance) {
		for (Integer d : occurance ) {
			System.out.println(d);
		}
	}

		
		public ArrayList<Integer> getOccurance() {
		return occurance;
	}
	public void setOccurance(ArrayList<Integer> occurance) {
		this.occurance = occurance;
	}
		public void afficheresultat(ArrayList<String> tar) {
			for (String s : tar ) {
				System.out.println(s);
			}
		}
	
	

}
