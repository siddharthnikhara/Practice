package com.training.aop.model;

public class SAccount {
	private Account account;

	
	public SAccount() {
		// TODO Auto-generated constructor stub
	}

	public SAccount(Account account) {
		super();
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "SAccount [account=" + account + "]";
	}

}
