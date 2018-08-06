package com.training.servicelocator;

//this class will work for any service
public class InitialContext {
	public Object lookUp(String jndiName) {
		if (jndiName.equalsIgnoreCase("db")) {
			System.out.println("looking for db services and creating  ");
			return new DBService();
		} else if (jndiName.equalsIgnoreCase("erp")) {
			System.out.println("looking for erp services and creating  ");
			return new ERPService();
		}
		return null;
	}
}
