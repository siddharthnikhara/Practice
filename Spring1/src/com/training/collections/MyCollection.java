package com.training.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollection {
	List questionBank;
	Set addressSet;
	AccountMap accountMap;

	public MyCollection() {
		// TODO Auto-generated constructor stub
	}


	public List getQuestionBank() {
		return questionBank;
	}

	public void setQuestionBank(List questionBank) {
		this.questionBank = questionBank;
	}

	public Set getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}


	public AccountMap getAccountMap() {
		return accountMap;
	}


	public void setAccountMap(AccountMap accountMap) {
		this.accountMap = accountMap;
	}


	@Override
	public String toString() {
		return "MyCollection [questionBank=" + questionBank + ", addressSet=" + addressSet + ", accountMap="
				+ accountMap + "]";
	}

}
