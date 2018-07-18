package com.training.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// XmlBeanFactory factory = new XmlBeanFactory(new
		// ClassPathResource("applicationContext.xml"));
		HelloService service = (HelloService) ctx.getBean("defaultHello");
		System.out.println(service.sayHello());
	}
}
