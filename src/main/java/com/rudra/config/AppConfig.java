package com.rudra.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rudra")
//@ComponentScan(basePackages = "org.example",
//includeFilters = @Filter(type = FilterType.REGEX, pattern = ".*Stub.*Repository"),
//excludeFilters = @Filter(Repository.class))
public class AppConfig {
	
}
