package com.brose.webstore.service.impl;

import java.util.List;

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

}
