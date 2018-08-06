package com.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;

public class StoreImage {
	public static void main(String[] args) throws FileNotFoundException {
		MongoClient client = new MongoClient("localhost", 27037);
		DB db = client.getDB("exdb");
		GridFS gfs = new GridFS(db, "myimage");

		String path = "/Users/siddharth.n/Desktop/srcFolder";

		File file1 = new File(path);
		for (File file : file1.listFiles()) {
			InputStream stream = new FileInputStream(file);
			GridFSInputFile picture = gfs.createFile(stream, file.getName());
			picture.setMetaData(new BasicDBObject("description:", "Image" + file.getName() + "store in exilant"));
			picture.save();

		}
		client.close();
		System.out.println("picture saved");
	}
}
