package com.example.shoppingcartapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = { "com.example.shoppingcartapi.repositories" })
@ComponentScan(basePackages = { "com.example" })
public class ShoppingCartApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApiApplication.class, args);
	}

}
