package com.example.springcache.interfaces;

import com.example.springcache.entity.ClassificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClassificationRepository extends JpaRepository<ClassificationEntity, Integer> {
}
