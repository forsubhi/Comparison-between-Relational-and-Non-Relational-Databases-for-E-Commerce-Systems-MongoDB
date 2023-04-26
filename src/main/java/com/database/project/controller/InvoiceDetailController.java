package com.database.project.controller;

import com.database.project.model.InvoiceDetail;
import com.database.project.model.Tutorial;
import com.database.project.repository.InvoiceDetailRepository;
import com.database.project.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/invoice-details")
public class InvoiceDetailController {

    @Autowired
    InvoiceDetailRepository invoiceDetailRepository;

    @GetMapping("/sample")
    public ResponseEntity<List<InvoiceDetail>> getAllTutorials(@RequestParam(required = false) String title) {
        try {
            ArrayList invoiceDetails = new ArrayList<>();
            invoiceDetailRepository.findAll(Pageable.ofSize(10)).forEach(invoiceDetails::add);
            return new ResponseEntity<>(invoiceDetails, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}