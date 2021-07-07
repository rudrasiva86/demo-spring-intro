# Adding Spring Framework

## Add spring dependencies to pom.xml

## Configuration

### Java Based Configuration
1. @Configuration
	- defined at class level
	- replaces the applicationContext.xml
2. @Bean
	- defined at method level
	- defines beans in spring container
	- @Bean(name="xxxx")
		- name is optional, but preferred
3. Setter Injection
	- As simple as a method call
	- Simply calling a setter method
	- Mystery of dependency injection goes away
		- with xml configuration its like a black box and makes us wonder whats going on behind the scenes
4. Constructor Injection
	- provide a constructor in the bean to set the dependencies
	- remove the setter
	