package com.training.strategey;

public class EWallet implements Payment {
	private String email;
	private String password;
	private String walletName;

	public EWallet(String email, String password, String walletName) {
		super();
		this.email = email;
		this.password = password;
		this.walletName = walletName;
	}

	@Override
	public void pay(int amount) {
		if (walletName.equalsIgnoreCase("paytm")) {
			amount = (int) (amount - (amount * 0.1));
			System.out.println("paying with paytm and got discount of 10% paid" + amount);
		} else {
			System.out.println("paid amount" + amount + "with wallet" + this.walletName);
		}

	}
}
