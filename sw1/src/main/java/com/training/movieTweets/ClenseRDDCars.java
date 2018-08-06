package com.training.movieTweets;

import java.util.Arrays;

import org.apache.spark.api.java.function.Function;

//saab,gas,std,four,sedan,fwd,four,110,5250,21,28,12170
//plymouth,gas,std,four,wagon,fwd,four,88,5000,24,30,8921
//audi,gas,std,four,wagon,fwd,five,110,5500,19,25,18920
public class ClenseRDDCars implements Function<String, String> {
	@Override
	public String call(String v1) throws Exception {
		String[] attributeList = v1.split(",");
		// change charactes to no.
		attributeList[3] = (attributeList[3].equals("two")) ? "2" : "4";
		attributeList[4] = attributeList[4].toUpperCase();

		return Arrays.toString(attributeList);
	}
}
