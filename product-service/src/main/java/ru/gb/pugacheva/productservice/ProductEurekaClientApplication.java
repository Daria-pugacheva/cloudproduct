package ru.gb.pugacheva.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductEurekaClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductEurekaClientApplication.class, args);
	}
}

