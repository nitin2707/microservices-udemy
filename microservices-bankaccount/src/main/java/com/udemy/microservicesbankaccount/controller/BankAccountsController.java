package com.udemy.microservicesbankaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.microservicesbankaccount.model.Accounts;
import com.udemy.microservicesbankaccount.model.Customer;
import com.udemy.microservicesbankaccount.repository.BankAccountRepository;

@RestController
public class BankAccountsController {

	@Autowired
	BankAccountRepository bankAccountRepository;
	
	@PostMapping("/myAccount")
	public Accounts getAccountDetails(@RequestBody Customer customer) {
		Accounts accounts = bankAccountRepository.findByCustomerId(customer.getCustomerId());
		return accounts;
	}
}
