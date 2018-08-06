package com.exilant.day1;

public class LambadaRunnable04 {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("Hi i am from annonymous classs"));
		new Thread(() -> {
			System.out.println("thread class");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("lambada calling completed");
		}).start();
	}
}
