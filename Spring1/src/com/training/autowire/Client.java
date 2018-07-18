package com.training.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
		Mobile mobile = ctx.getBean("mobile", Mobile.class);
		System.out.println(mobile.getCamera() + "   " + mobile.getScreen() + "    " + mobile.getSpeaker());
	}
}
