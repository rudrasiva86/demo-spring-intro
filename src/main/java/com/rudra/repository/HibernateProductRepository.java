package com.rudra.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rudra.model.Product;

@Repository("productRepository")
public class HibernateProductRepository implements IProductRepository {

	@Override
	public List<Product> findAll() {
		List<Product> products = new ArrayList<>();
		Product mac = new Product(1, "Mac", "Macbook Air", BigDecimal.valueOf(9999.99));
		products.add(mac);
		return products;
	}
	
}
