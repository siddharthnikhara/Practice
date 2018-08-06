package com.training.profile;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration("Production")
@Qualifier
public class DevDataBaseConfig implements DataBaseConfig {
	@Bean
	@Override
	public DataSource createDataSource() {
		System.out.println("creating production database instance");
		DriverManagerDataSource ds = new DriverManagerDataSource();
		return ds;
	}

}
