package com.example.org.generation.ItemsAPI;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootTest
@ComponentScan(basePackages = "com.example.org.generation.ItemsAPI")
@EntityScan(basePackages = "com.example.org.generation.ItemsAPI")
@EnableJpaRepositories(basePackages = "com.example.org.generation.ItemsAPI")
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}
