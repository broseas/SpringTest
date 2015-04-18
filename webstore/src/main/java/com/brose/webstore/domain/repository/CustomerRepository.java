package com.brose.webstore.domain.repository;

import java.util.List;

import com.brose.webstore.domain.Customer;

public interface CustomerRepository {
	
	List <Customer> getAllCustomers();
	
	Customer getCustomerById(String customerId);

}
