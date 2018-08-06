package com.training.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonClient04 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton singleton = Singleton.getInstance();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sample.ser"));
		out.writeObject(singleton);
		System.out.println(singleton);
		out.close();

		//////// de-serialization//////////////
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("sample.ser"));
		System.out.println("deserialzations--------------");
		
		Singleton singleton2 = (Singleton) input.readObject();
		System.out.println(singleton2);
		input.close();
	}
}
