package com.training;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetOneRecord {
	public static void main(String[] args) {
		MongoClient client = new MongoClient("localhost", 27037);
		DB db = client.getDB("exdb");
		DBCollection dbc = db.getCollection("emps");
		DBObject myObj = dbc.findOne();
		System.out.println("empID::  " + myObj.get("empid"));
		System.out.println("empName::  " + myObj.get("empname"));
		System.out.println("empmail:  "+myObj.get("empmail"));
	}

}
