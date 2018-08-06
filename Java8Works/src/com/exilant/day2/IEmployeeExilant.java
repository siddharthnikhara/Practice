package com.exilant.day2;

public class IEmployeeExilant implements IEmployee,IDepartment {

	@Override
	public void salary() {
		System.out.println("your salaryn is decided by exilant");

	}

	@Override
	public void noOfHours() {
		IDepartment.super.noOfHours();
	}


	
}
