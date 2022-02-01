package com.pnc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReaderExercise {
	public static void main(String[] args) throws Exception {
		
		try {
			FileReader file = new FileReader("src/Planet-x.txt");
			Scanner sc = new Scanner(file);
			
			while (sc.hasNext()) {
				String planetX = sc.nextLine();
				
		
		// HashMap<String, Integer> words = new HashMap<String, Integer>(); //declare
		// maps
		TreeMap<String, Integer> words = new TreeMap<String, Integer>();

		for (String word : planetX.toLowerCase().split("\\P{Alpha}+")) { // to lower case & spit by alpha numerics
			if (!words.containsKey(word)) {
				words.put(word, 1); // if there is one word
			} else {
				int count = words.get(word); // count words
				count++;
				words.put(word, count);
			}
		}

		words.forEach((key, value) -> System.out.println(key + "\t" + "\t" + "\t" + value));
			}
			sc.close();
		}
			catch(FileNotFoundException e){
				throw new Exception("No File Found");
			}
		
		

	}
	



}
