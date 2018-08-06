package com.training.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration("Development")
public class ProdDatabaseConfig implements DataBaseConfig {

	@Override
	@Bean
	public DataSource createDataSource() {
		System.out.println("creating development database instance");
		DriverManagerDataSource ds = new DriverManagerDataSource();
		return ds;
	}

}
