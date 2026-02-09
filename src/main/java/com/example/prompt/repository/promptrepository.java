package com.example.prompt.repository;

import com.example.prompt.model.promptmodel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface promptrepository extends MongoRepository<promptmodel,String> {
}
