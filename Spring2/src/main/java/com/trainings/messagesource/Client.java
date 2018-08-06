package com.trainings.messagesource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("messag-resource-context.xml");
		HelloWorld hello = ctx.getBean(HelloWorld.class);

		String goodMorning = ctx.getMessage("goodMorning", new Object[] {}, null);
		System.out.println(goodMorning);
		System.out.println("**********************");
		hello.sayHelloWorld();
		hello.sayHelloWorld_fr();
		hello.sayHelloWorld_GR();
	}
}
