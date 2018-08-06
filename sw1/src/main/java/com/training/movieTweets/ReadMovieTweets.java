package com.training.movieTweets;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class ReadMovieTweets {

	public static void main(String[] args) throws InterruptedException {
		String appName = "sampleApp";
		String sparkMaster = "local[2]";

		JavaSparkContext context = null;

		SparkConf conf = new SparkConf().setAppName(appName).setMaster(sparkMaster);

		context = new JavaSparkContext(conf);

		JavaRDD<String> tweetsRDD = context.textFile("./data/movietweets.csv");

		tweetsRDD.take(5).forEach(System.out::println);
		// count no of tweets
		int count = (int) tweetsRDD.count();

		JavaRDD<String> upperCaseRdd = tweetsRDD.map(temp -> temp.toUpperCase());

		upperCaseRdd.take(10).forEach(System.out::println);
		System.out.println(count);
		while (true) {
			Thread.sleep(100);
		}
	}
}
