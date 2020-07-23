package com.capgemini.test.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ApiErrorResponse {
	
	private String httpStatusCode;
	private String timesatmp;
	private String labelKey;
	private String error;

}
