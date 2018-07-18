package com.training.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Mobile mobile = ctx.getBean("mobile",Mobile.class);
		System.out.println(mobile.getCamera() + "   " + mobile.getScreen() + "    " + mobile.getSpeaker());
	}
}
