package com.training.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class AppConfig {
	@Bean(name = "mobile")
	public Mobile getMobile() {
		return new Mobile();
	}

	@Bean(name = "camera")
	public Camera getCamera() {
		return new Camera();
	}

	@Bean(name = "screen")
	public Screen getScreen() {
		return new Screen();
	}

	@Bean(name = "speaker")
	public Speaker getSpeaker() {
		return new Speaker();
	}
}
