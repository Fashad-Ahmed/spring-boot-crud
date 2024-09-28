package com.example.learning.learningCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningCrudApplication implements CommandLineRunner {

	@Autowired
	DB db;
	public static void main(String[] args) {
		SpringApplication.run(LearningCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
 		System.out.println(db.getData());
	}
}
