package com.assignment1.calculator.dao;

import org.springframework.stereotype.Repository;

import com.assignment1.calculator.model.Calculator;

@Repository
public class CalculatorDAOImpl implements CalculatorDAO{
	Double answer;
	Calculator cal = new Calculator();
	
	public Calculator addition(int number1, int number2) {
		answer = (double) (number1+number2);
		cal.setAnswer(answer);
		cal.setDetail(number1+" + "+number2+" = "+answer);
		return cal;
	}
}
