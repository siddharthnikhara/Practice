package com.training.servicelocator;

public class ERPService implements Service {
	@Override
	public String getName() {
		return "ERP";
	}

	@Override
	public void execute() {
		System.out.println("WE are executeing ERP services");

	}
}
