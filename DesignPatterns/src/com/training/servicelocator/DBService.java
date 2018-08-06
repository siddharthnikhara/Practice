package com.training.servicelocator;

public class DBService implements Service {

	@Override
	public String getName() {
		return "DB";
	}

	@Override
	public void execute() {
		System.out.println("WE are executeing db services");

	}

}
