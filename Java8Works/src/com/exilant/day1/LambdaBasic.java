package com.exilant.day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Program to show working of loops in jdl 1.7 and jdk 1.8
public class LambdaBasic {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		//
		// System.out.println("------before jdk 1.5----");
		// // jdk 1.5
		// for (int i = 0; i < numbers.size(); i++) {
		// System.out.println(numbers.get(i));
		// }
		// System.out.println("------before jdk 1.7----");
		//
		// // jdk 1.7
		// for (int n : numbers) {
		// System.out.println(n);
		// }
		// System.out.println("------before jdk 1.8(1st way)----");
		//
		// // jdk 1.8 with lambda
		// numbers.forEach((Integer n) -> System.out.println(n));
		// System.out.println("------before jdk 1.8(2nd way)----");
		//
		// // jdk 1.8 2nd way
		// numbers.forEach((n) -> System.out.println(n));
		//
		// // method reference
		// System.out.println("------method references------");
		// numbers.forEach(System.out::println);
		//
		// //consumer way
		// System.out.println("----consumer way");
		// numbers.forEach(new Consumer<Integer>() {
		//
		// @Override
		// public void accept(Integer t) {
		// System.out.println(t);
		// }
		// });

		numbers.forEach((temp) -> {
			int res = temp * 2;
			System.out.println(res + temp);
		});

		// field sum of members
		int result = 0;
		for (int temp : numbers) {
			result += temp * 2;
		}

		//System.out.println(numbers.stream.map(temp->temp*2).reduce(res,e)->res+e );

	}

}
