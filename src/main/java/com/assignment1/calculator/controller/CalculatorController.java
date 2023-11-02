package com.assignment1.calculator.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assignment1.calculator.model.Calculator;
import com.assignment1.calculator.service.CalculatorService;
import com.fasterxml.jackson.databind.util.JSONPObject;

@Controller
@RequestMapping("/calculatorapi/v1")
public class CalculatorController {
	
	@Autowired
	CalculatorService calService;
	
	@GetMapping(value = "/addition")
	public @ResponseBody Calculator addition(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
		return calService.addition(number1, number2);
	}
	
	@GetMapping(value = "/subtraction")
	public @ResponseBody Calculator subtraction(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
		return calService.subtraction(number1, number2);
	}
	
	@GetMapping(value = "/multiplication")
	public @ResponseBody Calculator multiplication(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
		return calService.multiplication(number1, number2);
	}
	
	@GetMapping(value = "/division")
	public @ResponseBody Calculator division(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
		return calService.division(number1, number2);
	}
	
	@GetMapping(value = "/square/{number1}")
	public @ResponseBody Calculator square(@PathVariable("number1") int number1) {
		return calService.square(number1);
	}
	
	@GetMapping(value = "/squareroot/{number1}")
	public @ResponseBody Calculator squareroot(@PathVariable("number1") int number1) {
		return calService.squareroot(number1);
	}
	
	@GetMapping(value = "/factorial/{number1}")
	public @ResponseBody Calculator factorial(@PathVariable("number1") int number1) {
		return calService.factorial(number1);
	}
	
	@PostMapping("/min-max")
    public @ResponseBody String calculateMinMax(@RequestBody Map<String, Object> list ) {
		return calService.minmax(list);
	}
}
