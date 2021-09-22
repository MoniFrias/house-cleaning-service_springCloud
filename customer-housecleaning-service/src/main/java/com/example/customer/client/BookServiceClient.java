package com.example.customer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.customer.entity.Response;

@FeignClient(name = "bookService-service", url = "${bookServiceFindByIdCustomer}")

public interface BookServiceClient {
	
	@GetMapping(value = "/findByCustomerId", params = {"id!="})
	public ResponseEntity<Response> findByCustomerId(@RequestParam(name = "id") Long id);

}

