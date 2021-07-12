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

### Bean Scopes
1. 5 Scopes
	- Valid in any configuration
		- Singleton
		- Prototype
	- Valid only in web-aware spring projects
		- Request
		- Session
		- Global
2. Singleton
	- Implies Only one instance
	- one instance per application context/spring container
	- Default bean scope
	- Java Config
		- @Scope("singleton")
		- Requires AOP jar
			- maven has transitive dependency and will be added already
3. Prototype
	- Guarantees New instance per request
	- Java Config
		- @Scope("prototype")
4. Request
	- Web scope
	- new instance per http request
5. Session
	- new instance per http session
	- spans across multiple request until the session is alive
6. Global
	- Single bean per application
	- just like singleton
	- alive until application restart

### Autowiring
- convention over configuration
- add @Autowired
	- setter injection
- Stereotype annotations
	- @Component
	- @Repository
	- @Service
	- @Controller
- @ComponentScan({"com.rudra"})
	- magic
	- @Bean is applicable is only on methods
		- so use stereotype annotations on classes
	