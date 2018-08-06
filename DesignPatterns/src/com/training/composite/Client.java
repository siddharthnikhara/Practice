package com.training.composite;

public class Client {

	public static void main(String[] args) {
		Customer customer1 = new Customer(101, "biru");
		Customer customer2 = new Customer(102, "anuj");
		Customer customer3 = new Customer(103, "chandu");
		Customer customer4 = new Customer(104, "bhavu");
		Customer customer5 = new Customer(105, "tanu");
		Customer customer6 = new Customer(106, "sid");
		Customer customer7 = new Customer(107, "goutu");
		
		customer1.addReference(customer2);
		customer1.addReference(customer3);
		customer1.addReference(customer4);
		
		
		customer2.addReference(customer5);
		customer2.addReference(customer6);
		
		customer4.addReference(customer7);
		System.out.println("print all customer reference tree");
		System.out.println("customer reference::  "+customer1.getCustName());
		
		for(Customer temp:customer1.getReference()) {
			System.out.println(temp.getCustId()+","+temp.getCustName());
		}
		

	}

}
