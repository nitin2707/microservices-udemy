package com.udemy.microservicesbankaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.udemy.microservicesbankaccount.controller") })
@EnableJpaRepositories("com.udemy.microservicesbankaccount.repository")
@EntityScan("com.udemy.microservicesbankaccount.model")
public class MicroservicesBankaccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBankaccountApplication.class, args);
	}

}
