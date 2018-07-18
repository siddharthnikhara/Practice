package com.training.helloI18N;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class AppConfig {
	@Bean(name = "english")
	public Greeting englishGreet() {
		return new GreetEnglish();
	}

	@Bean(name = "french")
	public Greeting frenchGreet() {
		return new GreetFrench();
	}

}
