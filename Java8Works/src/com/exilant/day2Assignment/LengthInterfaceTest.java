package com.exilant.day2Assignment;

public class LengthInterfaceTest {

	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.execute(new LengthInterface() {
			
			@Override
			public String compareString(String s1, String s2) {
				 int no1 = s1.length();
				 int no2 = s2.length();
				 if(no1>no2) {
					 return "s1"+no1;
				 }
				 else {
					 return "s2"+no2;
				 }
			}
		});
	}

}
