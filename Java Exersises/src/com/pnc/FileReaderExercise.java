package com.pnc;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

public class FileReaderExercise {
	public static void main(String[] args) throws Exception {

		try {
			File file = new File("src/2701-0.txt");
			BufferedReader input = new BufferedReader(new FileReader(file));  // read input file
			FileWriter copy = new FileWriter("mobyDick.txt"); //output file
			// TreeMap<String, Integer> words = new TreeMap<String, Integer>(); // declare maps
			HashMap<String, Integer> words = new HashMap<String, Integer>();
			String line;
			while ((line = input.readLine()) != null) {

				for (String word : line.toLowerCase().split("\\P{Alpha}+")) { // to lower case & spit by alpha
																				// numerics
					if (!words.containsKey(word)) {
						words.put(word, 1); // if there is one word
					} else {
						int count = words.get(word); // count words
						count++;
						words.put(word, count);
					}
				}

				// words.forEach((key, value) -> System.out.println(key + "\t" + "\t" + "\t" +
				// value));
			}
			TreeMap<String, Integer> wordsSorted = new TreeMap<String, Integer>(words);
			wordsSorted.forEach((key, value) -> {
				try {
					copy.write(key + "\t" + value + " \n");
				} catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();

				}

			});

			input.close();
			copy.close();

		} catch (FileNotFoundException e) {
			throw new Exception("No File Found");
		}

	}

}
