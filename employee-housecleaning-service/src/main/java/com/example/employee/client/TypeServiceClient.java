package com.example.employee.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.employee.entity.Response;

@FeignClient(name = "typeService-service", url = "http://localhost:8282/typeService")
public interface TypeServiceClient {
	
	@GetMapping(value = "/findByType")
	public ResponseEntity<Response> findByType(@RequestParam(name = "type") String type);

}
