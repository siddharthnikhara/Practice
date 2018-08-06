package com.training.singleton;

class Company {
	private Company() {
		System.out.println("constructor called");
	}

	public static Company getInstance(Company company) {
		if (company == null) {
			return new Company();
		}
		return company;
	}
}

class Emp {
	int empId;
	String empName;
	Company company;
}

public class SingletonClient02 {

	public static void main(String[] args) {
		// you can not create an instance of variable
		// Company company = new Company();
		Company company = null;
		company = Company.getInstance(company);
		
		Emp emp = new Emp();
		emp.empId= 101;
		emp.empName="kavita";
		emp.company = company;
		System.out.println("hashcode"+emp.company.hashCode());
		
		Emp emp1 = new Emp();
		emp1.empId= 102;
		emp1.empName="rama";
		emp1.company = company;
		System.out.println("hashcode"+emp1.company.hashCode());
		

	}

}
