package com.assignment1.calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment1.calculator.dao.CalculatorDAO;
import com.assignment1.calculator.model.Calculator;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	
	@Autowired
	CalculatorDAO calDao;
	
	public Calculator addition(int no1, int no2) {
		// TODO Auto-generated method stub
		return calDao.addition(no1, no2);
	}
}
