package com.rudrasiva86.service;

import java.util.List;

import com.rudrasiva86.model.Product;
import com.rudrasiva86.repository.IProductRepository;

public class ProductService implements IProductService {
	
	private IProductRepository productRepository;

	public void setProductRepository(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}

}
