package com.brose.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.brose.webstore.domain.Product;

public interface ProductService {

	List <Product> getAllProducts();
	
	List<Product> getProductsByCategory(String category);
	
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	
	Set<Product> getProductsBypriceFilter(Map<String, List<String>> filterParams);

	Product getProductById(String productId);
	
    List<Product> getProductsByManufacturer(String manufacturer);
	
}
