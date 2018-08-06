package com.example.FlightTicket;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.*" })
public class FlightTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightTicketApplication.class, args);
	}
	
}
