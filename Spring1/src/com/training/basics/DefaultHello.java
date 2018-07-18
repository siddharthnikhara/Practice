package com.training.basics;

public class DefaultHello implements HelloService {
	private String name;
	private String city;

	public DefaultHello() {
		// TODO Auto-generated constructor stub
	}

	public DefaultHello(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String sayHello() {

		return sayHello(name, city);
	}

	// the values for this is configuration file
	@Override
	public String sayHello(String name, String city) {
		String myStr[] = { "hey how are you mr %s & how is ypur city %s", "GM %s , are you in  %s" };
		int randomNumber = (int) (Math.random()*2);
		System.out.println(randomNumber);
		return String.format(myStr[randomNumber], name, city);
	}
	public void gInit() {
		System.out.println("ginit for hello goes here");
	}

	public void gDestroy() {
		System.out.println("gdestroy for hello goes here");
	}

}
