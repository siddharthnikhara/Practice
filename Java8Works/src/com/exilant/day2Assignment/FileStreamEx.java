package com.exilant.day2Assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStreamEx {

	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).map(Path::getFileName).map(Path::toString).map(String::toUpperCase).sorted().skip(2).limit(5).forEach(name->doSomeAction(name));
	}
	public static  void doSomeAction(String fileName) {
		System.out.println("your action goes here for"+fileName);
	}
}
