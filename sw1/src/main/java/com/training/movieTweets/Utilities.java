package com.training.movieTweets;

import org.apache.spark.api.java.JavaRDD;

public class Utilities {

	public static void printStringRDD(JavaRDD<String> stringRDD, int limit) {
		for (String temp : stringRDD.take(limit)) {
			System.out.println(temp);
		}
		System.out.println("------------");
	}

	// this method to keep java

	public static void hold() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
