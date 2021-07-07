package com.rudrasiva86;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rudrasiva86.config.AppConfig;
import com.rudrasiva86.service.IProductService;
import com.rudrasiva86.service.ProductService;

public class Application {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IProductService productService = ctx.getBean("productService", ProductService.class);
		System.out.println(productService);
		
		System.out.println(productService.findAll());
		
		IProductService productService2 = ctx.getBean("productService", ProductService.class);
		System.out.println(productService2);
		// verify the object address for both the instances of product service
	}
}
