package com.rudrasiva86.service;

import java.util.List;

import com.rudrasiva86.model.Product;
import com.rudrasiva86.repository.HibernateProductRepository;
import com.rudrasiva86.repository.ProductRepository;

public class ProductService implements IProductService {
	
	private ProductRepository productRepository; 

	public ProductService() {
		this.productRepository = new HibernateProductRepository();
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}

}
