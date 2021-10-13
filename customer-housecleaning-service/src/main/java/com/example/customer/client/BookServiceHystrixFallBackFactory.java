package com.example.customer.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.customer.entity.Response;
import com.example.customer.model.BookService;

@Component
public class BookServiceHystrixFallBackFactory implements BookServiceClient{

	@Override
	public ResponseEntity<Response> findByCustomerId(Long id) {
		Response response = new Response();
		BookService bookService = BookService.builder()
				.bookNumber(null)
				.id(null)
				.idEmployee(null)
				.codeP(null)
				.typeService("None")
				.date(null)
				.starTime(null)
				.endTime(null)
				.cost(null)
				.statusPay("None")
				.statusService("None").build();
		response.setData(bookService);
		return ResponseEntity.ok(response);
	}

	
}
