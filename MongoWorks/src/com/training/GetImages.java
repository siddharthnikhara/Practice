package com.training;

import java.io.IOException;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;

public class GetImages {
	public static void main(String[] args) throws IOException {

		MongoClient client = new MongoClient("localhost", 27037);
		DB db = client.getDB("exdb");
		GridFS gfs = new GridFS(db, "myimage");

		String path = "/Users/siddharth.n/Desktop/destFolder/";

		List<GridFSDBFile> list = gfs.find(new BasicDBObject());

		for (GridFSDBFile file : list) {
			file.writeTo(path + file.getFilename());
		}
		System.out.println("restore images");
		client.close();

	}

}
