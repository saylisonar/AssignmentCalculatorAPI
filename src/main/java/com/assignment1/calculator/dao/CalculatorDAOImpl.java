package com.assignment1.calculator.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

import com.assignment1.calculator.model.Calculator;

@Repository
public class CalculatorDAOImpl implements CalculatorDAO{
	double answer;
	Calculator cal = new Calculator();
	
	public Calculator addition(int number1, int number2) {
		answer = (double) (number1+number2);
		cal.setAnswer(answer);
		cal.setDetail(number1+" + "+number2+" = "+answer);
		return cal;
	}

	@Override
	public Calculator subtraction(int number1, int number2) {
		answer = (double) (number1-number2);
		cal.setAnswer(answer);
		cal.setDetail(number1+" - "+number2+" = "+answer);
		return cal;
	}

	@Override
	public Calculator multiplication(int number1, int number2) {
		answer = (double) (number1*number2);
		cal.setAnswer(answer);
		cal.setDetail(number1+" * "+number2+" = "+answer);
		return cal;
	}

	@Override
	public Calculator division(int number1, int number2) {
		answer =  ((double)number1/number2);
		cal.setAnswer(answer);
		cal.setDetail(number1+" / "+number2+" = "+answer);
		return cal;
	}

	@Override
	public Calculator square(int number1) {
		answer = (double) (number1*number1);
		cal.setAnswer(answer);
		cal.setDetail("Square of "+number1+" = "+answer);
		return cal;
	}

	@Override
	public Calculator squareroot(int number1) {
		answer = Math.sqrt(number1);
		cal.setAnswer(answer);
		cal.setDetail("Squareroot of "+number1+" = "+answer);
		return cal;
	}

	@Override
	public Calculator factorial(int number1) {
		int fact = 1; 
		for(int i=1;i<=number1;i++){    
			fact=fact*i;    
		} 
		answer = (double) fact;
		cal.setAnswer(answer);
		cal.setDetail(number1+"! = "+answer);
		return cal;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String minmax(Map<String, Object> list) {
		List<Integer> list3 = new ArrayList<>();
		for (Entry<String, Object> me : list.entrySet()) { 
           list3 = (List<Integer>) me.getValue();
        } 
		int min = Collections.min(list3);
        int max = Collections.max(list3);
		return "min : "+min+", max : "+max;
	}
}
