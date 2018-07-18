package com.training.helloI18N;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Greeting greeting = ctx.getBean("english", Greeting.class);
		System.out.println(greeting.greetHello());
		
	}

}
