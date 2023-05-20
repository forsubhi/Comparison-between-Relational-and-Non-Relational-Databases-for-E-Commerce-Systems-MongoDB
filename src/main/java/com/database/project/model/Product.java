package com.database.project.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Product {

    @Id
    private String id;

    private String index;

    private String brandName;

    private String details;

    private String sizes;

    private String mrp;

    private String sellPrice;

    private String discount;

    private String category;

}
