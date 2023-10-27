package com.assignment1.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assignment1.calculator.model.Calculator;
import com.assignment1.calculator.service.CalculatorService;

@Controller
@RequestMapping("/calculatorapi/v1")
public class CalculatorController {
	
	@Autowired
	CalculatorService calService;
	
	@RequestMapping(value = "/addition", method = RequestMethod.GET)
	public @ResponseBody Calculator add(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
		return calService.addition(number1, number2);
	}
}
