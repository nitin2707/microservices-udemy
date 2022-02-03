package com.udemy.microservicesloans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.udemy.microservicesloans.controller") })
@EnableJpaRepositories("com.udemy.microservicesloans.repository")
@EntityScan("com.udemy.microservicesloans.model")
public class MicroservicesLoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesLoansApplication.class, args);
	}

}
