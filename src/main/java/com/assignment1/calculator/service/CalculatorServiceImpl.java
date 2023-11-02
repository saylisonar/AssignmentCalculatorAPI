package com.assignment1.calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment1.calculator.dao.CalculatorDAO;
import com.assignment1.calculator.model.Calculator;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	
	@Autowired
	CalculatorDAO calDao;
	
	public Calculator addition(int number1, int number2) {
		return calDao.addition(number1, number2);
	}

	@Override
	public Calculator subtraction(int number1, int number2) {
		return calDao.subtraction(number1, number2);
	}

	@Override
	public Calculator multiplication(int number1, int number2) {
		return calDao.multiplication(number1, number2);
	}

	@Override
	public Calculator division(int number1, int number2) {
		return calDao.division(number1, number2);
	}

	@Override
	public Calculator square(int number1) {
		return calDao.square(number1);
	}

	@Override
	public Calculator squareroot(int number1) {
		return calDao.squareroot(number1);
	}

	@Override
	public Calculator factorial(int number1) {
		return calDao.factorial(number1);
	}
	
}
