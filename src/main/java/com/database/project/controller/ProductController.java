package com.database.project.controller;

import com.database.project.model.InvoiceDetail;
import com.database.project.model.InvoiceDetailForInsert;
import com.database.project.model.Product;
import com.database.project.repository.InvoiceDetailRepository;
import com.database.project.repository.InvoiceDetailRepositoryForInsert;
import com.database.project.repository.ProductRepository;
import com.mongodb.client.MongoClient;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/sample")
    public ResponseEntity<List<Product>> getSample() {
        try {
            ArrayList products = new ArrayList<>();
            productRepository.findAll(Pageable.ofSize(10)).forEach(products::add);

            return new ResponseEntity<>(products, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/query")
    public ResponseEntity<List<Document>> query() {
        try {
            List<Document> products = productRepository.findByDetailsFilter("solid cotton blend collar");

            return new ResponseEntity<>(products, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}