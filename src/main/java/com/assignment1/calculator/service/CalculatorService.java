package com.assignment1.calculator.service;

import com.assignment1.calculator.model.Calculator;

public interface CalculatorService {
	public Calculator addition(int number1, int number2);
	public Calculator subtraction(int number1, int number2);
	public Calculator multiplication(int number1, int number2);
	public Calculator division(int number1, int number2);
	public Calculator square(int number1);
	public Calculator squareroot(int number1);
	public Calculator factorial(int number1);
}
