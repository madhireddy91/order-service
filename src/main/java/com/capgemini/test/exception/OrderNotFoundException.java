package com.capgemini.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;
import lombok.Setter;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class OrderNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	@Getter @Setter
	private String label;
	public OrderNotFoundException(String label, String message) {
		super(message);
		this.label = label;
	}
	

}
