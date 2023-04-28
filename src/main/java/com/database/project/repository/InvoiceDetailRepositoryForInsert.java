package com.database.project.repository;

import com.database.project.model.InvoiceDetail;
import com.database.project.model.InvoiceDetailForInsert;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceDetailRepositoryForInsert extends MongoRepository<InvoiceDetailForInsert, String> {

}