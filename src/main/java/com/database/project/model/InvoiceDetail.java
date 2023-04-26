package com.database.project.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
public class InvoiceDetail {
    @Id
    @Column
    @JsonIgnore
    private String uuid;

    @Column(name = "invoiceno")
    private String invoiceNo;
    @Column(name = "stockcode")
    private String stockCode;
    @Column
    private String description;
    @Column
    private Integer quantity;
    @Column(name = "invoicedate")
    private LocalDateTime invoiceDate;
    @Column(name = "unitprice")
    private Float unitPrice;
    @Column(name = "customerid")
    private Integer customerID;
    @Column
    private String country;
    @Column(name = "itemtotal")
    private Float itemTotal;
}
