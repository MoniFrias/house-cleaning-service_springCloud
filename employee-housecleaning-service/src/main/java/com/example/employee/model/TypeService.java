package com.example.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeService {

	
	private Long id;
	
	private String name;
	
	private Long cost;
	
	private Long timeSuggested;

}
