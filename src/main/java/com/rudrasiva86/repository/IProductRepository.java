package com.rudrasiva86.repository;

import java.util.List;

import com.rudrasiva86.model.Product;

public interface IProductRepository {
	List<Product> findAll();
}
