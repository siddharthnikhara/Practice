package com.training.profile;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.getEnvironment().setActiveProfiles("Production");
		//DataBaseConfig ds = ctx.getBean(DevDataBaseConfig.class);
		//DataBaseConfig ds1 = ctx.getBean(DevDataBaseConfig.class);
		//System.out.println(ds.createDataSource());
		//System.out.println(ds1.createDataSource());
		
		//ctx.scan("com.training.profile");
		//ctx.refresh();
		//ctx.getEnvironment().setActiveProfiles("Production");

	}
}
