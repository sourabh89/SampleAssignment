package com.example.information.test.testSystem.dao;

import com.example.information.test.testSystem.model.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Testdao extends MongoRepository<Test, Integer> {

}