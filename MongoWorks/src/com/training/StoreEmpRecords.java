package com.training;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class StoreEmpRecords {

	public static void main(String[] args) {
		MongoClient client = new MongoClient("localhost", 27037);
		DB db = client.getDB("exdb");
		DBCollection dbc = db.getCollection("emps");
		DBObject obj = new BasicDBObject();
		obj.put("empid", 1005);
		obj.put("empname", "kavita");
		obj.put("empmail", "kavita@mail.com");
		obj.put("empsal", 25552202);
		// dbc.save(obj);
		// System.out.println("object saved");
		// System.out.println("--------");

		Map map = new HashMap<>();

		map.put("empid", 1006);
		map.put("empname", "kaaavita");
		map.put("empmail", "kaaavita@mail.com");
		map.put("empsal", 2502);

		// dbc.save(new BasicDBObject(map));

		String jsonString = "{empid:303,empname:'sid'," + "empmail:'sidd@gmail.com',empsal:33333}";
		// dbc.save((DBObject) JSON.parse(jsonString));
		// System.out.println("object saved");

		Employee emp = new Employee();
		emp.setEmpId(3447);
		emp.setEmpName("siffgghjgjghjmghuugfddd");
		emp.setEmpMail("djkdjsbvn bvjnghghgbkdsb@gmail.com");
		emp.setEmpSal(554582754.0);

		// BasicDBObject obj1 = new BasicDBObject();
		// obj1.put("empid", emp.getEmpId());
		// obj1.put("empname", emp.getEmpName());

		dbc.save(emp);
		System.out.println("object saved");
	}

}
