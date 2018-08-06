package com.exilant.day2;

import java.util.Arrays;
import java.util.List;

public class PersonClient {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person(101, "Goutam"), new Person(102, "siddharth"),
				new Person(103, "rupa"));
		// personList.forEach(System.out::println);
	//	PersonConsumer print = new PersonConsumer();
		personList.forEach(PersonConsumer::m1);
	}

}
