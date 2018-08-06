package com.training.collections;

import java.util.Set;

public class AddressSet {

	private Set<String> addresses;

	public AddressSet() {
		// TODO Auto-generated constructor stub
	}

	public AddressSet(Set<String> addresses) {
		super();
		this.addresses = addresses;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "AddressSet [addresses=" + addresses + "]";
	}

}
