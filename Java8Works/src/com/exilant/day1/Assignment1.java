package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Assignment1 {

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(new Customer(101, "sid", 2000, "A"),
				new Customer(102, "sidd", 4999, "E"), new Customer(103, "siddd", 8000, "C"),
				new Customer(104, "sidddd", 10000, "D"));
		System.out.println("---------before sort---------");
		customers.forEach(System.out::println);
		//two things compare
		
		System.out.println("------after sort on purchase(ASC) by name and than designation------------");
		Comparator<Customer> customComparator = Comparator.comparing(Customer::getCustomerName).thenComparing(Customer::getDesignation);
		Collections.sort(customers,customComparator);
		customers.forEach(System.out::println);
		
	}

}
