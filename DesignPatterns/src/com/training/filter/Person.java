package com.training.filter;

public class Person {
	private String name;
	private String sex;
	private String maritalStatus;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String sex, String maritalStatus) {
		super();
		this.name = name;
		this.sex = sex;
		this.maritalStatus = maritalStatus;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getSex() {
		return sex;
	}

	protected void setSex(String sex) {
		this.sex = sex;
	}

	protected String getMaritalStatus() {
		return maritalStatus;
	}

	protected void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", maritalStatus=" + maritalStatus + "]";
	}

}
