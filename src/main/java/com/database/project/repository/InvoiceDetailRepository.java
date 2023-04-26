package com.database.project.repository;

import com.database.project.model.InvoiceDetail;
import com.database.project.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface InvoiceDetailRepository extends JpaRepository<InvoiceDetail, String> {

}