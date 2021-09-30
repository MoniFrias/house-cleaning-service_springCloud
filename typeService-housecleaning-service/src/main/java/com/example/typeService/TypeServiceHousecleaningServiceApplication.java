package com.example.typeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TypeServiceHousecleaningServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TypeServiceHousecleaningServiceApplication.class, args);
	}

}
