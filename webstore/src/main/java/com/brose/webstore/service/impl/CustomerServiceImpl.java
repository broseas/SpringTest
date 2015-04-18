package com.brose.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brose.webstore.domain.Customer;
import com.brose.webstore.domain.repository.CustomerRepository;
import com.brose.webstore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
	public List<Customer> getAllCustomers() {
		return customerRepo.getAllCustomers();
	}

	public Customer getCustomerById(String customerId) {
		return customerRepo.getCustomerById(customerId);
	}

}
