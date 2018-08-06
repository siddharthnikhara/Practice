package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContoller {
	// @RequestMapping(method = RequestMethod.GET, path = "hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "helloWorld";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorld helloWorld1() {
		return new HelloWorld("hello World");
	}

	@GetMapping(path = "/hello-world/{name}")
	public HelloWorld helloWorld2(@PathVariable String name) {
		return new HelloWorld("hello world::   " + name);
	}
}
