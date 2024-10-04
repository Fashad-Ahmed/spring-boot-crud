# Beans

a bean is an object that is instantiated, managed, and injected by the Spring IoC (Inversion of Control) container. Beans are central to the Spring Framework, and Spring Boot makes it easy to define and manage them.

Spring Beans provide a way to define the core components of an application, such as services, repositories, controllers, and any other object that is required for the application to function.
A bean is simply a Java object that is created, configured, and managed by the Spring IoC container. Beans are defined in the application context, and Spring automatically injects dependencies into them when needed, using dependency injection.

In Spring Boot, you typically define beans using annotations, though XML configuration is also possible (but less common in modern Spring Boot projects).

### How to Define a Bean in Spring Boot

There are several ways to define beans in Spring Boot:

### 1. Using Stereotype Annotations

   Spring Boot automatically scans for certain annotations that indicate that a class should be registered as a bean. These annotations include:

```@Component:``` A generic stereotype for any Spring-managed component.

```@Service:``` A specialization of @Component used to denote service layer classes.

```@Repository:``` A specialization of @Component used for data access objects (DAOs).

```@Controller or @RestController:``` Used in Spring MVC to mark classes as web controllers.

When Spring Boot scans for these annotations (via component scanning), it automatically registers these classes as beans in the application context.

```
@Component
public class MyBean {
    public void doSomething() {
        System.out.println("Bean method executed");
    }
}
```
Here, MyBean is automatically registered as a Spring bean, thanks to the @Component annotation.

### 2. Using @Bean Annotation

You can define a bean manually by annotating a method with @Bean. This is useful when you need more control over the bean instantiation process.

``` 
@Configuration
public class AppConfig {
    
    @Bean
    public MyBean myBean() {
        return new MyBean(); // This object will be managed by Spring
    }
}
```

The method myBean() returns an instance of MyBean, which Spring will manage as a bean in the application context.
@Configuration is used to indicate that the class contains Spring bean definitions.