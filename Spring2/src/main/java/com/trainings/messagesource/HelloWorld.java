package com.trainings.messagesource;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class HelloWorld {
	private String greeting;
	private String message;
	@Autowired
	private MessageSource messageSource;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void sayHelloWorld() {
		System.out.println(messageSource.getMessage("helloworld.greet", new Object[] { greeting, message }, null));
	}

	public void sayHelloWorld_fr() {
		System.out.println(
				messageSource.getMessage("helloworld.greet", new Object[] { greeting, message }, new Locale("FR")));
	}
	public void sayHelloWorld_GR() {
		System.out.println(
				messageSource.getMessage("helloworld.greet", new Object[] { greeting, message }, new Locale("DE")));
	}

	@Override
	public String toString() {
		return "HelloWorld [greeting=" + greeting + ", message=" + message + ", messageSource=" + messageSource + "]";
	}

}
