package com.database.project.repository;

import com.database.project.model.InvoiceDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceDetailRepository extends MongoRepository<InvoiceDetail, String> {

}