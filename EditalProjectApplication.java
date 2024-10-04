package com.example.EditalProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.EditalProject.Repository")
@EntityScan(basePackages = "com.example.EditalProject.Entity")
public class EditalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EditalProjectApplication.class, args);
	}

}
