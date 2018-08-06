package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	@Autowired
	private Configuration configuration;

	@GetMapping("/currency")
	public Configuration retrieveCurrencyConfiguration() {
		return new Configuration(configuration.getInr(), configuration.getUsd());
	}
}
