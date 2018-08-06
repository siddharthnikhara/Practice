package com.training.movieTweets;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class DataSource {
	public static JavaRDD<Integer> getCollatData() {

		JavaSparkContext spContext = SparkConnection.getContext();

		List<Integer> data = Arrays.asList(3, 4, 545, 54545, 4558787, 453, 464, 464, 8, 31464, 64, 646, 46, 46, 46, 464,
				4, 64, 46);

		JavaRDD<Integer> collData = spContext.parallelize(data);
		collData.cache();
		return collData;
	}

}
