package com.udemy.microservicesbankaccount.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.microservicesbankaccount.model.Accounts;

@Repository
public interface BankAccountRepository extends CrudRepository<Accounts, Long> {

	Accounts findByCustomerId(int customerId);
}
