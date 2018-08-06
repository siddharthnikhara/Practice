package com.training.mvc;

public class Client {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "diyvya");
		StarView view = new StarView();
		EmployeeController cnt = new EmployeeController(emp, view);
		cnt.updateView("star");

	}

}
