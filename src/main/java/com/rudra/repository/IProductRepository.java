package com.rudra.repository;

import java.util.List;

import com.rudra.model.Product;

public interface IProductRepository {
	List<Product> findAll();
}
