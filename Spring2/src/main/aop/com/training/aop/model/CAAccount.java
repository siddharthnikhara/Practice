package com.training.aop.model;

public class CAAccount {

	private Account account;

	public CAAccount() {
		// TODO Auto-generated constructor stub
	}

	public CAAccount(Account account) {
		super();
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double showBalance() {
		return account.getBalance();
	}

	@Override
	public String toString() {
		return "SAccount [account=" + account + "]";
	}
}
