package com.exilant.day2Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment3 {
	// public static void main(String[] args) {
	// //Random random = new Random();
	// Stream.iterate(10,i -> i+1).limit(5).sorted().forEach(System.out::println);
	// }
	public static void main(String[] args) throws IOException {
		writeToFile01();
	}

	public static void writeToFile01() throws IOException {
		//
		// try (BufferedReader bw = new BufferedReader(new FileReader("sample.txt"))) {
		// String st;
		// while ((st=bw.readLine())!= null){
		// System.out.println();
		// }
		// }
		// System.out.println("data saved sucessfully");
		//
		// }

		try (FileReader reader = new FileReader("sample.txt"); BufferedReader br = new BufferedReader(reader);) {
			br.lines().forEach(System.out::println);
		}
	}
}