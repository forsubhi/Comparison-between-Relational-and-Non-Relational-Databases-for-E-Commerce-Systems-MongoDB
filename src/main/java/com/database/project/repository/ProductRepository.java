package com.database.project.repository;

import com.database.project.model.InvoiceDetail;
import com.database.project.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> ,CustomProductRepository{

    List<Product> findByDetailsContains(String filter);
}