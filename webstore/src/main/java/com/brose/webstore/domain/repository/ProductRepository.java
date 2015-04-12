package com.brose.webstore.domain.repository;

import java.util.List;

import com.brose.webstore.domain.Product;

public interface ProductRepository {
	
	List <Product> getAllProducts();
	
	Product getProductById(String productID);

}
