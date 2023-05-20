package com.database.project.repository;

import com.database.project.model.Product;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CustomProductRepositoryImpl implements CustomProductRepository {

    @Autowired
    MongoClient mongoClient;

    @Override
    public ArrayList<Document> findByDetailsFilter(String filter) {
        Bson bson = new Document("details", Pattern.compile(filter));

        MongoDatabase database = mongoClient.getDatabase("ecommerce");
        MongoCollection<Document> collection = database.getCollection("product");
        ArrayList<Document> result = collection.find(bson).into(new ArrayList<Document>());;
       return result;

    }
}
