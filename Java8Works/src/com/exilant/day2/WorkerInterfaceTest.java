package com.exilant.day2;

public class WorkerInterfaceTest {

	public static void main(String[] args) {
		Runner runner = new Runner();

		// earlier version
		runner.execute(new WorkerInterface() {

			@Override
			public void doSomething() {
				System.out.println("in main annonymous classs------");

			}
		});
		System.out.println("in lambada way in multiple lines---------");
		// in java 8
		runner.execute(() -> {
			System.out.println("lambada expression------------");
		});
		System.out.println("in lambada way in single lines---------");
		runner.execute(() -> System.out.println("in single line lambada"));

	}

}
