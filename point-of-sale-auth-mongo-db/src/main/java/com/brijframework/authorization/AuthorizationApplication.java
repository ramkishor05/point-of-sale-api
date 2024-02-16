package com.brijframework.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AuthorizationApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(AuthorizationApplication.class, args);
	}

}
