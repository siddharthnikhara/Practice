package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMapExample02 {
	// earlier
	public static List<PriorityCustomer> filterCustomers(List<Customer> customers) {
		List<PriorityCustomer> priorityCustomer = new ArrayList<>();
		for (Customer temp : customers) {
			if (temp.getCustomerPurchase() > 5000) {
				priorityCustomer.add(new PriorityCustomer(temp.getCustomerId(), temp.getCustomerName(), "gold"));
			}
		}
		return priorityCustomer;
	}

	// in java 8 way
	public static List<PriorityCustomer> filterCustomer1(List<Customer> customers) {
		List<PriorityCustomer> priorityCustomers = customers.stream().map(temp -> {
			if (temp.getCustomerPurchase() > 3000) {
				return new PriorityCustomer(temp.getCustomerId(), temp.getCustomerName(), "silver");
			} else if (temp.getCustomerPurchase() > 5000) {
				return new PriorityCustomer(temp.getCustomerId(), temp.getCustomerName(), "gold");
			}

			else {
				return new PriorityCustomer(temp.getCustomerId(), temp.getCustomerName(), "platinum");
			}
		}).collect(Collectors.toList());
		return priorityCustomers;
	}

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(new Customer(101, "anuj", 2000, "Engineer"),
				new Customer(102, "sid", 4999, "DEveloper"), new Customer(103, "tanu", 8000, "cool person"),
				new Customer(104, "goutam", 10000, "positive person"));
		//filterCustomers(customers).forEach(System.out::println);
		// filterCustomer1(customers.forEach(System.out::println));
		filterCustomer3(customers).forEach(System.out::println);
		
	}

	public static List<PriorityCustomer> filterCustomer2(List<Customer> customers) {

		return customers.stream().filter(temp -> temp.getCustomerPurchase() > 5000).map(temp -> {
			return new PriorityCustomer(temp.getCustomerId(), temp.getCustomerName(), "gold");
		}).collect(Collectors.toList());

	}

	public static List<PriorityCustomer> filterCustomer3(List<Customer> customers) {
		List<PriorityCustomer> priorityCustomers = customers.stream().map(temp -> {
			return new PriorityCustomer(temp.getCustomerId(), temp.getCustomerName(),
					temp.getCustomerPurchase() > 0 && temp.getCustomerPurchase() < 3000 ? "silver"
							: temp.getCustomerPurchase() > 3000 && temp.getCustomerPurchase() < 5000 ? "gold"
									: "platinum");
		}).collect(Collectors.toList());
		return priorityCustomers;
	}

}
