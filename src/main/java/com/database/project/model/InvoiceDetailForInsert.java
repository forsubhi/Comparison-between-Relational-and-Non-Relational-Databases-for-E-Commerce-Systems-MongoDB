package com.database.project.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class InvoiceDetailForInsert {

    @Id
    private String id;

    private String invoiceNo;

    private String stockCode;

    private String description;

    private Integer quantity;

    private String invoiceDate;

    private Float unitPrice;

    private Integer customerID;

    private String country;

    private Float itemTotal;
}
