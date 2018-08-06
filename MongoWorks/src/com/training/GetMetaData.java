package com.training;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class GetMetaData {
	public static void main(String[] args) {
		// localhost port 27037
		MongoClient client = new MongoClient("localhost", 27037);
		System.out.println("connection got to " + client);

		// System.out.println("list opf dbs from mongo");

		for (String dbName : client.getDatabaseNames()) {
			// System.out.println(dbName);

			DB db = client.getDB(dbName);
			for (String collection : db.getCollectionNames()) {
				System.out.println(collection);
			}
		}
	}
}
