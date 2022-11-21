package com.example.digimantra.mongo.project.MongoDb.Project;

import com.example.digimantra.mongo.project.MongoDb.Project.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDbProjectApplication	{


	public static void main(String[] args) {

		SpringApplication.run(MongoDbProjectApplication.class, args);
	}
}
