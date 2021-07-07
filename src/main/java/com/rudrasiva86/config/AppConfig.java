package com.rudrasiva86.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rudrasiva86.repository.HibernateProductRepository;
import com.rudrasiva86.repository.IProductRepository;
import com.rudrasiva86.service.IProductService;
import com.rudrasiva86.service.ProductService;

@Configuration
@ComponentScan("com.rudrasiva86")
public class AppConfig {
	
	// setter injection
	@Bean(name="productService")
	public IProductService getProductService() {
		ProductService productService = new ProductService();
		productService.setProductRepository(getProductRepository());
		return productService;
	}
	
	@Bean(name="productRepository")
	public IProductRepository getProductRepository() {
		return new HibernateProductRepository();
	}
}
