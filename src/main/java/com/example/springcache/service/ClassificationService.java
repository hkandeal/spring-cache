package com.example.springcache.service;

import com.example.springcache.domain.Classification;
import com.example.springcache.entity.ClassificationEntity;
import com.example.springcache.exceptions.RecordNotFoundException;
import com.example.springcache.interfaces.ClassificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClassificationService {
    @Autowired
    ClassificationRepository repository;

    public List<ClassificationEntity> getAllClassification()
    {
        List<ClassificationEntity> classificationList = repository.findAll();
        System.out.println("get all classifications:"+classificationList);
        if(classificationList.size() > 0) {
            return classificationList;
        } else {
            return new ArrayList<ClassificationEntity>();
        }
    }

    @Cacheable(value="classifications", key="#id")
    public ClassificationEntity getClassificationById(int id) throws RecordNotFoundException
    {
        Optional<ClassificationEntity> classification = repository.findById(id);

        if(classification.isPresent()) {
            return classification.get();
        } else {
            throw new RecordNotFoundException("No classification record exist for given id");
        }
    }
    @CacheEvict(value = "classifications", key = "#id")
    public ClassificationEntity updateClassificationById(int id , ClassificationEntity classification) {
        return repository.save(classification);
    }
}
