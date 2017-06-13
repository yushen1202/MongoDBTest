package com.myApp.mongoDB.MongoDBTest;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class HelloMongo {

	public static void main(String args[]) {
		try {

			// 连接到 mongodb 服务
			MongoClient mongoClient = new MongoClient("localhost", 27017);

			// 连接到数据库
			MongoDatabase mongoDatabase = mongoClient.getDatabase("runoob");

			System.out.println("Connect to database successfully");
			MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("col");
			System.out.println(mongoCollection.find());
			
			mongoClient.close();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		} 
	}

}
