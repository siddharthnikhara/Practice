package com.training.composite;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int custId;
	private String custName;
	private List<Customer> reference;

	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
		 this.reference = new ArrayList<Customer>();
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public List<Customer> getReference() {
		return reference;
	}

	public void setReference(List<Customer> reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", reference=" + reference + "]";
	}

	public void addReference(Customer customer) {
		this.reference.add(customer);

	}

	public void removeRefernce(Customer customer) {
		this.reference.remove(customer);
	}
}
