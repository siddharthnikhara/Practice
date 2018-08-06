package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort05 {

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(new Customer(101, "anuj", 2000, "Engineer"),
				new Customer(102, "sid", 4999, "DEveloper"), new Customer(103, "tanu", 8000, "cool person"),
				new Customer(104, "goutam", 10000, "positive person"));
		System.out.println("---------before sort---------");
		customers.forEach(e -> {
			System.out.println(e);
		});

		// jdk1.7 older version sort
		Collections.sort(customers, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {

				return o1.getCustomerName().compareTo(o2.getCustomerName());
			}

		});
		System.out.println("------after sort on name(ASC)------------");

		// after sort name by jdk 1.7
		customers.forEach(System.out::println);
		System.out.println("------after sort on purchase(ASC)------------");

		// jdk 1.8 sorting
		customers.sort((Customer c1, Customer c2) -> (int) (c1.getCustomerPurchase() - c2.getCustomerPurchase()));
		;
		customers.forEach(System.out::println);

		// java 8 way
		System.out.println("------after sort on designation(ASC)------------");
		customers.sort((c1, c2) -> c1.getDesignation().compareTo(c2.getDesignation()));
		customers.forEach(System.out::println);
		
		Comparator<Customer> customComparatorAsc = (c1,c2)->
			c1.getCustomerName().compareTo(c2.getCustomerName());
			Collections.sort(customers,customComparatorAsc);
			System.out.println("---after sort on name ASC -------");
			customers.forEach(System.out::println);

			customers.sort(customComparatorAsc.reversed());
			System.out.println("---after sort on name DSC -------");
			customers.forEach(System.out::println);

	}

}
