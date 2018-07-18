package com.training.employee;

public class Employee {
	private int empId;
	private String empName;
	private double empSal;

	public Employee() {
		System.out.println("default constructor invoked");
	}

	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public void init() {
		System.out.println("init for emp goes here");
	}

	public void destroy() {
		System.out.println("destroy for emp goes here");
	}
	public void gInit() {
		System.out.println("Ginit for emp goes here");
	}

	public void gDestroy() {
		System.out.println("Gdestroy for emp goes here");
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
