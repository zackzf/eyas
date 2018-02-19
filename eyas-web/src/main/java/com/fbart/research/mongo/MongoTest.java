package com.fbart.research.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoTest {
    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient("172.16.66.6", 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("dd");

        MongoCollection<Document> collection = mongoDatabase.getCollection("test");

        FindIterable<Document> findIterable = collection.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while (mongoCursor.hasNext()) {
            System.out.println(mongoCursor.next());
        }

    }
}
