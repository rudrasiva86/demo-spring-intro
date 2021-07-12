package com.rudra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rudra.config.AppConfig;
import com.rudra.service.IProductService;
import com.rudra.service.ProductService;

public class Application {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IProductService productService = ctx.getBean("productService", ProductService.class);
		
		System.out.println(productService.findAll());
		((AnnotationConfigApplicationContext)ctx).close();
	}
}
