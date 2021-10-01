package com.example.houseCleaning.client;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.houseCleaning.entity.Response;
import com.example.houseCleaning.model.Appointment;
import com.example.houseCleaning.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;


@FeignClient(name = "employee-service", url = "${employee}")
public interface EmployeeClient {

	@PostMapping(path = "/save")
	public ResponseEntity<Response> save(@RequestBody Employee employee);
	
	@PostMapping(path = "/saveAppointment")
	public ResponseEntity<Response> saveAppointment(@Valid @RequestBody Appointment appointment);
	
	@PutMapping(path = "/updateAppointment")
	public ResponseEntity<Response> updateAppointment(@RequestBody Appointment appointment);
	
	@PutMapping(path = "/updateStatusPayment")
	public ResponseEntity<Response> updateStatusPayment(@RequestParam(name = "bookService") Long bookService, @RequestParam(name = "status")String status);

	@PutMapping(path = "/updateStatusAppointment")
	public ResponseEntity<Response> updateStatusAppointment(@RequestParam(name = "bookService") Long bookService, @RequestParam(name = "status") String status);



}
