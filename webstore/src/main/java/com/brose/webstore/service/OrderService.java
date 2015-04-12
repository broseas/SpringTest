package com.brose.webstore.service;

public interface OrderService {

	void processOrder(String  productId, long quantity);
	
}
