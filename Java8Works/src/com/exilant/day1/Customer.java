package com.exilant.day1;

public class Customer {
	private int customerId;
	private String customerName;
	private double customerPurchase;
	private String designation;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	

	public Customer(int customerId, String customerName, double customerPurchase, String designation) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPurchase = customerPurchase;
		this.designation = designation;
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getCustomerPurchase() {
		return customerPurchase;
	}

	public void setCustomerPurchase(double customerPurchase) {
		this.customerPurchase = customerPurchase;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPurchase="
				+ customerPurchase + ", designation=" + designation + "]";
	}

}
