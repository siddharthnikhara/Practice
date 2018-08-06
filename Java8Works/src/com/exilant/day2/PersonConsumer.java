package com.exilant.day2;

import java.util.function.Consumer;

public class PersonConsumer implements Consumer<Person> {

	@Override
	public  void accept(Person t) {
			//m1(t);
	}
	public static void m1(Person t) {
		System.out.println("Person ID:: "+t.getPid() + "  " + "Person Name:: "+t.getName().toUpperCase());

	}

}
