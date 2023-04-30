package com.database.project.repository;

import com.database.project.model.InvoiceDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InvoiceDetailRepository extends MongoRepository<InvoiceDetail, String> {

    List<InvoiceDetail> findByCustomerID(String customerID);
}