package com.brose.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brose.webstore.domain.Product;
import com.brose.webstore.domain.repository.ProductRepository;
import com.brose.webstore.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

  @Autowired
  private ProductRepository productRepository;
  
  public void processOrder(String productId, long quantity) {
    Product productById = productRepository.getProductById(productId);
    
    if(productById.getUnitsInStock() < quantity){
      throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ productById.getUnitsInStock());
    }
    
    productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
  }

}
