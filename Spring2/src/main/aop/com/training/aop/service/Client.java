package com.training.aop.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("banking-context.xml");
		BankingService service = ctx.getBean("bService", BankingService.class);
		//System.out.println(service.getCaaccount().showBalance());
		System.out.println(service.getSaccount().getAccount());
//		System.out.println("-----------------");
//		System.out.println(service.getSaccount());
		
		//String retVal = service.setAndGet("harry");
		//System.out.println(retVal);
		
		//service.throwSomeException();

	}
}
