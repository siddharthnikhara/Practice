package com.exilant.day2Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineIfExilant {

	public static void main(String[] args) throws IOException {
		 
	        String strLine = "";
	        try ( BufferedReader  br = new BufferedReader( new FileReader("sample.txt"));){
	           
	            while( (strLine = br.readLine()) != null){
	                System.out.println(strLine);
	            }
	        }
	}

}
