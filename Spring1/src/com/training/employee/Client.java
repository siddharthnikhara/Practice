package com.training.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.basics.DefaultHello;
import com.training.basics.HelloService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml","applicationContext.xml");
		Employee emp = ctx.getBean("employee", Employee.class);
		Employee emp1 = ctx.getBean("employee", Employee.class);

		System.out.println("------");
		System.out.println(emp.hashCode() + "         " + emp);
		System.out.println("*********");
		System.out.println(emp1.hashCode() + "         " + emp1);
		
		HelloService service = (HelloService) ctx.getBean(DefaultHello.class);
		System.out.println(service.sayHello());
		((AbstractApplicationContext) ctx).registerShutdownHook();
	}
}
