package com.exilant.day2;

public interface IEmployee {
	public void salary();

	default void noOfHours() {
		System.out.println("Every employee has to work for 8 hours");
	}
}
