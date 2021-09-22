package com.example.customer.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookService {

	private Long id;
	private Long bookNumber;
	private Long idCustomer;
	private Long idEmployee;
	private Long codeP;
	private String typeService;
	private LocalDate date;
	private LocalTime starTime;
	private LocalTime endTime;
	private Long cost;
	private String statusPay;
	private String statusService;

}
