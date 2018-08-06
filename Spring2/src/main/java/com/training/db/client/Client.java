package com.training.db.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.db.entity.Employee;
import com.training.db.interfaces.IEmployeeDAO;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IEmployeeDAO employeeDao = ctx.getBean(IEmployeeDAO.class);
		// employeeDao.insertEmployee(new Employee(103, "anuj", 55580.23));
		System.out.println(employeeDao.getEmployee(103));
		System.out.println(employeeDao.getAllEmployee());
	}
}
