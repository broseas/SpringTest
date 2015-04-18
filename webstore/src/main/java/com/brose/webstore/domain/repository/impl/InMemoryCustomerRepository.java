package com.brose.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.brose.webstore.domain.Customer;
import com.brose.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository(){
		Customer cust1 = new Customer("1","Anya","home");
		Customer cust2 = new Customer("2","Brose","home");
		Customer cust3 = new Customer("3","Rizzo","home");
		Customer cust4 = new Customer("4","Jerod","not home");
		
		listOfCustomers.add(cust4);
		listOfCustomers.add(cust3);
		listOfCustomers.add(cust2);
		listOfCustomers.add(cust1);

	}

	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}

	public Customer getCustomerById(String customerId) {
		Customer customerById = null;
	    
	    for(Customer customer : listOfCustomers) {
	      if(customer!=null && customer.getCustomerId()!=null && customer.getCustomerId().equals(customerId)){
	    	  customerById = customer;
	        break;
	      }
	    }
	    
	    if(customerById == null){
	      throw new IllegalArgumentException("No customer found with the customer id: "+ customerId);
	    }
	    
	    return customerById;	
	}
}
