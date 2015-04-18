package com.brose.webstore.service;

import java.util.List;

import com.brose.webstore.domain.Customer;

public interface CustomerService {
	
	List <Customer> getAllCustomers();
	
	Customer getCustomerById(String customerId);

}
