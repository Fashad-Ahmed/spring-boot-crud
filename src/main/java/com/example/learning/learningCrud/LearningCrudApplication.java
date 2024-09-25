package com.example.learning.learningCrud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningCrudApplication implements CommandLineRunner {

	ProdDB prodDB;
	public static void main(String[] args) {
		SpringApplication.run(LearningCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		prodDB = new ProdDB();
		System.out.println(prodDB.getData());
	}
}
