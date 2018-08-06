package com.exilant.stats;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient {

	public static void main(String[] args) {
		List<Dragons> dragonList = Stream
				.of(new Dragons("Error1", "USA", 15), new Dragons("Error1", "USA", 33),
						new Dragons("firnan", "INDIA", 15), new Dragons("HASAI", "RUSSIA", 15))
				.collect(Collectors.toList());
		// to find no of dragons
		Map<String, Long> mapDragonCount = dragonList.stream()
				.collect(Collectors.groupingBy(Dragons::getName, Collectors.counting()));
		System.out.println(mapDragonCount);
		Map<String, Integer> mapDragonCollect = dragonList.stream()
				.collect(Collectors.groupingBy(Dragons::getName, Collectors.summingInt(Dragons::getCount)));

		// mapDragonCollect.forEach((k, v) -> {
		// System.out.println("dragon name::" + k + " ,dragon count :: " + v);
		// });
		// write a java 8 snippet to find the stats of the dragon list should display
		// sum/average/min/max/avg of dragons
		int mapDragonSum = dragonList.stream().collect(Collectors.summingInt(Dragons::getCount));
		System.out.println(mapDragonSum);
		System.out.println("-----avg-----");
		double mapDragonAverage = dragonList.stream().collect(Collectors.averagingDouble(Dragons::getCount));
		System.out.println(mapDragonAverage);
		System.out.println("-----min-----");
		// int mapDragonInt =
		// dragonList.stream().collect(Collectors.minBy(Dragons::getCount));

		IntSummaryStatistics stats = dragonList.stream().mapToInt(Dragons::getCount).summaryStatistics();
		System.out.println("sum is::" + stats.getSum());
		System.out.println("avg is::" + stats.getAverage());
		System.out.println("max is::" + stats.getMax());
		System.out.println("min is::" + stats.getMin());
		System.out.println("count is::" + stats.getCount());
		// find dragons by country and keep the names of dragons of diff countries in
		// the list/set
		System.out.println("by counttry");
		List<List<String>> list = new ArrayList<List<String>>();
		Map<String, List<String>> map = dragonList.stream().collect(
				Collectors.groupingBy(Dragons::getCountry, Collectors.mapping(Dragons::getName, Collectors.toList())));
		map.forEach((k, v) -> {
			System.out.println("Dragons country:" + k + "    dragon name: " + v);
		});

	}

}
