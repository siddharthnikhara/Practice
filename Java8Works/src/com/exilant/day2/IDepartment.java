package com.exilant.day2;

public interface IDepartment {
	default void workLocation() {
		System.out.println("fffffff");
	}
	default void noOfHours() {
		System.out.println("demands work only 6 hrs");
	}
}
