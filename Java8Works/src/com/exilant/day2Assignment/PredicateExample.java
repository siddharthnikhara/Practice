package com.exilant.day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.omg.CORBA.PRIVATE_MEMBER;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> greateThan = i -> i > 10;
		Predicate<Integer> lessThan = i -> i < 10;

		Predicate<Integer> positiveNo = i -> i > 0;
		Predicate<Integer> betweenRange = i -> i > 0 && i < 100;

		// System.out.println(greateThan.test(5));

		List<Integer> integerList = Arrays.asList(10, 12, 30, -10, 50, 1);
		List<Integer> greaterThan10List = filteredList(integerList, greateThan);
		greaterThan10List.forEach(System.out::println);
			System.out.println("-------------");
		Predicate<Integer> compoundPredicate = positiveNo.and(betweenRange);
		List<Integer> compoundList = filteredList(integerList, compoundPredicate);
		compoundList.forEach(System.out::println);

	}

	public static List<Integer> filteredList(List<Integer> numbers, Predicate<Integer> predicate) {
		List<Integer> filteredList = new ArrayList<Integer>();
		for (Integer temp : numbers) {
			if (predicate.test(temp))
				filteredList.add(temp);
		}
		return filteredList;
	}

}
