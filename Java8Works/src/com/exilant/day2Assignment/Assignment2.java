package com.exilant.day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.exilant.day2.Person;

public class Assignment2 {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person(101, "Goutam"), new Person(102, "siddharth"),
				new Person(103, "rupa"));
		Predicate<Person> pid = i-> i.getPid()>102;
		Predicate<Person> name = i-> i.getName().equals("Goutam");
		List<Person> ff = filteredPerson(personList, pid);
		ff.forEach(System.out::println);
		System.out.println("--------");
		List<Person> ff1 = filteredPerson(personList, name);
		ff1.forEach(System.out::println);
	}

	public static List<Person> filteredPerson(List<Person> person, Predicate<Person> predicate) {
		List<Person> filteredList = new ArrayList<Person>();
		for (Person temp : person) {
			if (predicate.test(temp))
				
			filteredList.add(temp);
		}
			return filteredList;
			
	}

}
