package com.database.project.repository;

import com.database.project.model.Product;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public interface CustomProductRepository {
    ArrayList<Document> findByDetailsFilter(String filter);
}
