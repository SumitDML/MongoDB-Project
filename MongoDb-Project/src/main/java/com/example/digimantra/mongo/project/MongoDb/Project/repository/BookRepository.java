package com.example.digimantra.mongo.project.MongoDb.Project.repository;

import com.example.digimantra.mongo.project.MongoDb.Project.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BookRepository extends MongoRepository<Book, Integer>{

}