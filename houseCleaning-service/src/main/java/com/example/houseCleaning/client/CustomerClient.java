package com.example.houseCleaning.client;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.houseCleaning.entity.Response;
import com.example.houseCleaning.model.Customer;

@FeignClient(name = "customer-service", url = "${customerSave}")

public interface CustomerClient {
	
	@PostMapping(path = "/save")
	public ResponseEntity<Response> save(@Valid @RequestBody Customer customer);	
	
	@GetMapping(path = "/findById")
	public ResponseEntity<Response> findById(@RequestParam(name = "id") Long id);

}