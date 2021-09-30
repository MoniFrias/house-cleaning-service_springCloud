package com.example.houseCleaning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class HouseCleaningServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseCleaningServiceApplication.class, args);
	}

}
