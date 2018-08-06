package com.training;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetQueryData {

	public static void main(String[] args) {
		MongoClient client = new MongoClient("localhost", 27037);
		DB db = client.getDB("exdb");
		DBCollection dbc = db.getCollection("emps");

		Map map = new HashMap<>();
		map.put("empid", 1);
		map.put("empname", 1);
		DBObject projections = new BasicDBObject(map);

		// if multiple condition
		DBObject queryCondition = new BasicDBObject("empid", 101);
		DBObject obj = new BasicDBObject("empid", 101);
		// DBObject sortCondition = new BasicDBObject("empname", -1);
		DBCursor cursor = dbc.find(queryCondition, obj);
		while (cursor.hasNext()) {
			DBObject object = cursor.next();
			System.out.println("empID::  " + object.get("empid"));
			System.out.println("empName::  " + object.get("empname"));
			System.out.println("empmail:  " + object.get("empmail"));
		}

	}

}
