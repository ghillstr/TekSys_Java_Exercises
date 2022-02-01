package com.pnc;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class FileReaderExercise {
	public static void main(String[] args) throws Exception {

		try {
			File file = new File("src/Planet-x.txt");
			BufferedReader input = new BufferedReader(new FileReader(file));
			@SuppressWarnings("resource")
			FileWriter copy = new FileWriter("PlanetX.txt");

			String line;
			while ((line = input.readLine()) != null) {

				// HashMap<String, Integer> words = new HashMap<String, Integer>(); //declare
				// maps
				TreeMap<String, Integer> words = new TreeMap<String, Integer>();

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

				words.forEach((key, value) -> System.out.println(key + "\t" + "\t" + "\t" + value));

				words.forEach((key, value) -> {
					try {
						copy.write(key + "\t" + value + " \n");
					} catch (IOException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();

					}

				});

			}
			input.close();

		} catch (FileNotFoundException e) {
			throw new Exception("No File Found");
		}

	}

}
