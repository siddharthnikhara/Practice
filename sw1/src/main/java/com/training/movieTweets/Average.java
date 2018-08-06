package com.training.movieTweets;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;

public class Average implements Function2<String, String,String> {

	@Override
	public String call(String v1,String v2) throws Exception {
		int firstVal =0;
		int secondVal=0;
		
		//firstVal =(isNumeric(v1)) ?
				//Integer.va
				
		String[] attributeList = v1.split(",");
		
			int no = Integer.parseInt(attributeList[10]);
		
		return no+"";
	}

	
	


}
