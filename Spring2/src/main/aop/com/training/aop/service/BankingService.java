package com.training.aop.service;

import com.training.aop.model.CAAccount;
import com.training.aop.model.SAccount;

public class BankingService {
	private SAccount saccount;
	private CAAccount caaccount;

	public BankingService() {
		// TODO Auto-generated constructor stub
	}

	public BankingService(SAccount saccount, CAAccount caaccount) {
		super();
		this.saccount = saccount;
		this.caaccount = caaccount;
	}

	public SAccount getSaccount() {
		return saccount;
	}

	public void setSaccount(SAccount saccount) {
		this.saccount = saccount;
	}

	public CAAccount getCaaccount() {
		return caaccount;
	}

	public void setCaaccount(CAAccount caaccount) {
		this.caaccount = caaccount;
	}

	public String setAndGet(String name) {
		return "hello mr::  " + name;
	}

	public void throwSomeException() {
		int a = 1;
		if (a == 1) {
			throw new RuntimeException();
		}
		System.out.println("user is ok with value........");

	}

	@Override
	public String toString() {
		return "BankingService [saccount=" + saccount + ", caaccount=" + caaccount + "]";
	}

}
