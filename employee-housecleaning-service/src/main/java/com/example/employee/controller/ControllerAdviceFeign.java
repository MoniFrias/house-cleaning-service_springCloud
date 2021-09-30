package com.example.employee.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.github.andrewoma.dexx.collection.Map;
import feign.FeignException;
import javax.servlet.http.HttpServletResponse;


@RestControllerAdvice
public class ControllerAdviceFeign {

	@ExceptionHandler(FeignException.BadRequest.class)
	public Map<String, Object> ControllerAdviceFeign(FeignException e, HttpServletResponse response) {
        response.setStatus(e.status());
        return (Map<String, Object>) new JSONObject(e.contentUTF8()).toMap(); 
    }
}
