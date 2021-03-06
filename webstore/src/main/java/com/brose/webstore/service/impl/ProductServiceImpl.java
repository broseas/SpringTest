package com.brose.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brose.webstore.domain.Product;
import com.brose.webstore.domain.repository.ProductRepository;
import com.brose.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	public List<Product> getProductsByCategory(String category) {
		 return productRepository.getProductsByCategory(category);
	}
	
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
	    return productRepository.getProductsByFilter(filterParams);
	}

	public Product getProductById(String productId) {
		return productRepository.getProductById(productId);
	}

	public List<Product> getProductsByManufacturer(String manufacturer) {
		return productRepository.getProductsByManufacturer(manufacturer);
	}

	public Set<Product> getProductsBypriceFilter(
			Map<String, List<String>> filterParams) {
		return productRepository.getProductsBypriceFilter(filterParams);
	}
}
