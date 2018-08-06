package com.training.movieTweets;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.rdd.DoubleRDDFunctions;

public class SparkOperationClient {
	public static void main(String[] args) {
		Logger.getLogger("org").setLevel(Level.ERROR);
		JavaSparkContext sparkContext = SparkConnection.getContext();

		// start loading the data
		// 1 load the collection and cache it
		JavaRDD<Integer> collData = DataSource.getCollatData();
		System.out.println("total no if records::  " + collData.count());

		// 2 load the file and cache it

		JavaRDD<String> autoDataContent = sparkContext.textFile("./data/auto-data.csv");
		System.out.println("no. of records " + autoDataContent.count());

		System.out.println("loading data from file");

		// Utilities.printStringRDD(autoDataContent, 10);

		// autoDataContent.take(5).forEach(System.out::println);
		// storing rdd
		// autoDataContent.saveAsTextFile("./data/auto-data-modified.csv");
		JavaRDD<String> tsvData = autoDataContent.map(str -> str.replace(",", "	"));
		// Utilities.printStringRDD(tsvData, 5);

		/////////////////////////// FILTER EXAMPLE/////////////////

		String header = autoDataContent.first();

		JavaRDD<String> autoDataWithoutHeader = autoDataContent.filter(s -> !s.equals(header));

		// Utilities.printStringRDD(autoDataWithoutHeader, 5);

		//////////////////////// toyota//////////////////

		JavaRDD<String> toyotaCar = autoDataContent.filter(s -> s.contains("toyota"));
		// Utilities.printStringRDD(toyotaCar, 198);

		//////////////////////// Unique //////////////////

		JavaRDD<String> unique = autoDataContent.distinct();
		// System.out.println(unique.count());
		// Utilities.printStringRDD(unique, 199);
		// for (String temp : unique.take((int) unique.count())) {
		// System.out.println(temp);
		// }
		// System.out.println(unique.count());

		// to count no of words in the given rdd

		System.out.println("using flat map");

		JavaRDD<String> map = toyotaCar.flatMap(new FlatMapFunction<String, String>() {

			@Override
			public Iterator<String> call(String t) throws Exception {
				// TODO Auto-generated method stub
				return Arrays.asList(t.split(",")).iterator();
			}

		});
		// System.out.println("ToyotaRDD word count:: " + map.count());

		System.out.println("After clensing data*******************");

		JavaRDD<String> clenseRDD = autoDataContent.map(new ClenseRDDCars());

		Utilities.printStringRDD(clenseRDD, 5);

		System.out.println("After set data*******************");
		JavaRDD<String> word1 = sparkContext.parallelize(Arrays.asList("hello", "how", "are", "you", "today"));
		JavaRDD<String> word2 = sparkContext.parallelize(Arrays.asList("hello", "how", "were", "you", "yesterday"));
		System.out.println("union operation");
		Utilities.printStringRDD(word1.union(word2), 10);
		// System.out.println("Intersection operation");
		// Utilities.printStringRDD(word1.intersection(word2), 9);

		Integer collDataCount = collData.reduce((x, y) -> x + y);
		// System.out.println("sum of integer " + collData);

		System.out.println("average------------");

		// JavaRDD<Integer> no = autoDataWithoutHeader.map(new Average());
		// System.out.println(no.count());

		// int count = (int) no.count();
		// System.out.println(count);

	}
}
