package com.rudrasiva86;

import com.rudrasiva86.service.IProductService;
import com.rudrasiva86.service.ProductService;

public class Application {
	
	public static void main(String[] args) {
		IProductService productService = new ProductService();
		System.out.println(productService.findAll());
	}
}
