package com.example.springcache.controller;

import com.example.springcache.entity.ClassificationEntity;
import com.example.springcache.exceptions.RecordNotFoundException;
import com.example.springcache.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassificationController {
    @Autowired
    ClassificationService service;

    @GetMapping("/classification")
    public ResponseEntity<List<ClassificationEntity>> getClassifications() {
        System.out.println("get all classifications");
        List<ClassificationEntity> list = service.getAllClassification();
        return new ResponseEntity<List<ClassificationEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/classification/{id}")
    public ResponseEntity<ClassificationEntity> getEmployeeById(@PathVariable("id") int id)
            throws RecordNotFoundException {
        ClassificationEntity entity = service.getClassificationById(id);
        return new ResponseEntity<ClassificationEntity>(entity, new HttpHeaders(), HttpStatus.OK);
    }

}
