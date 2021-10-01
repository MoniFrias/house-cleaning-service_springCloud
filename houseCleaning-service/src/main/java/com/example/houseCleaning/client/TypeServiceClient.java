package com.example.houseCleaning.client;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.houseCleaning.entity.Response;
import com.example.houseCleaning.model.TypeService;

@FeignClient(name = "typeService-service", url = "${typeService}")

public interface TypeServiceClient {

	@PostMapping(path = "/save")
	public ResponseEntity<Response> save(@Valid @RequestBody TypeService typeService);
}
