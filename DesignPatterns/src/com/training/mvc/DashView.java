package com.training.mvc;


public class DashView {
	public void printEmployee(Employee employee) {
		System.out.println("----- ");
		System.out.println("EmpId::"+employee.getEmpId());
		System.out.println("EmpName::"+employee.getEmpName());
		System.out.println("----- ");
	}

}
