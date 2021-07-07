package com.rudrasiva86.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.rudrasiva86.repository.HibernateProductRepository;
import com.rudrasiva86.repository.IProductRepository;
import com.rudrasiva86.service.IProductService;
import com.rudrasiva86.service.ProductService;

@Configuration
@ComponentScan("com.rudrasiva86")
public class AppConfig {
	
	@Bean(name="productService")
	@Scope(value=BeanDefinition.SCOPE_SINGLETON)
//	@Scope(value=BeanDefinition.SCOPE_PROTOTYPE)
	public IProductService getProductService() {
		return new ProductService(getProductRepository());
	}
	
	@Bean(name="productRepository")
	public IProductRepository getProductRepository() {
		return new HibernateProductRepository();
	}
}
