package com.example.entity;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {

	private String firstName;
	private String idProof;
	private String lastName;
	private String nationality;

	public Customer() {
	}

	public Customer(String firstName, String idProof, String lastName, String nationality) {
		super();
		this.firstName = firstName;
		this.idProof = idProof;
		this.lastName = lastName;
		this.nationality = nationality;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", idProof=" + idProof + ", lastName=" + lastName + ", nationality="
				+ nationality + "]";
	}

}
