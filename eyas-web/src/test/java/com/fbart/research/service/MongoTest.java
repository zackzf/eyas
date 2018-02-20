package com.fbart.research.service;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:eyas.xml"})
public class MongoTest {
    private Logger logger = LoggerFactory.getLogger(MongoTest.class);

    private String mongoIp = "172.16.66.6";

    /**
     * 连接数据库
     */
    @Test
    public void test01() {
        MongoClient mongoClient = new MongoClient(mongoIp, 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("dd");

        logger.info("Connect to database successfully");
    }

    /**
     * 创建集合
     */
    @Test
    public void test02() {
        MongoClient mongoClient = new MongoClient(mongoIp, 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("dd");
        mongoDatabase.createCollection("test2");
        logger.info("集合创建成功。");
    }

    /**
     * 插入文档
     */
    @Test
    public void test03() {
        MongoClient mongoClient = new MongoClient(mongoIp, 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("dd");
        MongoCollection<Document> collection = mongoDatabase.getCollection("test2");
        Document document = new Document("title", "MongoDB").append("description", "database").append("likes", 100).append("by", "Fly2");
        List<Document> documents = new ArrayList<>();
        documents.add(document);
        collection.insertMany(documents);
    }

    /**
     * 检索所有文档
     */
    @Test
    public void test04() {
        MongoClient mongoClient = new MongoClient(mongoIp, 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("dd");
        MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("test2");
        FindIterable<Document> findIterable = mongoCollection.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while (mongoCursor.hasNext()) {
            logger.info(mongoCursor.next().toString());
        }
    }

    /**
     * 更新文档
     */
    @Test
    public void test05() {
        MongoClient mongoClient = new MongoClient(mongoIp, 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("dd");
        MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("test2");

        mongoCollection.updateMany(Filters.eq("likes", 100), new Document("$set", new Document("likes", 200)));

        FindIterable<Document> findIterable = mongoCollection.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while (mongoCursor.hasNext()) {
            logger.info(mongoCursor.next().toString());
        }
    }

    /**
     * 删除文档
     */
    @Test
    public void test06() {
        MongoClient mongoClient = new MongoClient(mongoIp, 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("dd");
        MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("test2");

//        mongoCollection.deleteOne(Filters.eq("likes", 200));
        mongoCollection.deleteMany(Filters.eq("likes", 100));

        FindIterable<Document> findIterable = mongoCollection.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while (mongoCursor.hasNext()) {
            logger.info(mongoCursor.next().toString());
        }
    }
}
