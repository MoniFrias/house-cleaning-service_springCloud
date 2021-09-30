package com.example.houseCleaning.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee{

	private Long id;
	private String name;
	private String lastName;
	private Long nss;
	private String email;
	private String city;
	private String state;
	private Long postalCode;
	private Long phoneNumber;
	private List<Appointment> appointments;
}
