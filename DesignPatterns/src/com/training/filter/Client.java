package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("sid", "male", "single"));
		list.add(new Person("anuj", "male", "single"));
		list.add(new Person("tanu", "female", "married"));
		list.add(new Person("chandu", "female", "single"));
		list.add(new Person("goutam", "male", "married"));

		ICriteria maleCriteria = new Male();
		ICriteria femaleCriteria = new FemaleCriteria();
		ICriteria married = new Married();
		ICriteria andCriteria = new AndCriteria(maleCriteria, married);
		ICriteria orCriteria = new OrCriteria(femaleCriteria, married);
		System.out.println("-------male---------------");
		maleCriteria.meetCriteria(list).forEach(System.out::println);
		System.out.println("-------female---------------");
		femaleCriteria.meetCriteria(list).forEach(System.out::println);
		System.out.println("-------married---------------");
		married.meetCriteria(list).forEach(System.out::println);
		System.out.println("_-------male+/married---------");
		andCriteria.meetCriteria(list).forEach(System.out::println);
		System.out.println("_-------female||(or)married---------");
		orCriteria.meetCriteria(list).forEach(System.out::println);
	}
}
