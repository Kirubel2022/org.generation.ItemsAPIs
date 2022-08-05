package com.example.org.generation.ItemsAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.org.generation.ItemsAPI")
@EntityScan(basePackages = "com.example.org.generation.ItemsAPI")
@EnableJpaRepositories(basePackages = "com.example.org.generation.ItemsAPI")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
