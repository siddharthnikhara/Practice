package com.training.strategey;

public class CreditCard implements Payment {
	private String name;
	private String cardNo;
	private String cvv;
	private String dateOfExpiry;
	private double discount;
	private String bankName;

	public CreditCard(String name, String cardNo, String cvv, String dateOfExpiry, double discount, String bankName) {
		super();
		this.name = name;
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
		this.discount = discount;
		this.bankName = bankName;
	}

	@Override
	public void pay(int amount) {
		if (this.bankName.equalsIgnoreCase("hdfc")) {
			amount = (int) (amount - (amount * 0.1));
			System.out.println("paying with hdfc and got discount of 10% paid:::" + amount);
		} else {
			System.out.println("paid amount from credit card" + amount);
		}

	}

	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", cardNo=" + cardNo + ", cvv=" + cvv + ", dateOfExpiry=" + dateOfExpiry
				+ ", discount=" + discount + ", bankName=" + bankName + "]";
	}

}
