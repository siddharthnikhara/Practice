package com.exilant.day2Assignment;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomFilterEx {

	public static void main(String[] args) {
		int randomNumber = ThreadLocalRandom.current().nextInt(100, 200);
		System.out.println(randomNumber);
		System.out.println("-------");
		Random random = new Random();
		//random.ints(10, 100, 200).forEach(System.out::println);
		random.ints(10, 200, 500).sorted().forEach(System.out::println);

	}

}
