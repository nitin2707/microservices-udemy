package com.udemy.microservicescards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.udemy.microservicescards.controller") })
@EnableJpaRepositories("com.udemy.microservicescards.repository")
@EntityScan("com.udemy.microservicescards.model")
public class MicroservicesCardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesCardsApplication.class, args);
	}

}
