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
	
	// constructor injection
	@Bean(name="productService")
	public IProductService getProductService() {
		return new ProductService(getProductRepository());
	}
	
	@Bean(name="productRepository")
	public IProductRepository getProductRepository() {
		return new HibernateProductRepository();
	}
}
