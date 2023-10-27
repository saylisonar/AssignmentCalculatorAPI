package com.assignment1.calculator.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Calculator implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	private Double answer;
	private String detail;
}
