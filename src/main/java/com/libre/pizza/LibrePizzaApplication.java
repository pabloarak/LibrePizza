package com.libre.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LibrePizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrePizzaApplication.class, args);
	}

}
