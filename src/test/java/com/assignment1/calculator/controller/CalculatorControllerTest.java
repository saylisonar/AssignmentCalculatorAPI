/**
 * 
 */
package com.assignment1.calculator.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.assignment1.calculator.model.Calculator;

/**
 * @author sayali.sonar
 *
 */
@SpringBootTest
class CalculatorControllerTest {

	@Autowired
	private CalculatorController controller;
	int number1 = 12, number2 = 15;
	
	@Test
	void testAddition() {
		Calculator calculator = new Calculator();
		calculator.setAnswer(27.0);
		calculator.setDetail("12 + 15 = 27.0");
		Calculator result = controller.addition(number1, number2);
		//assertEquals(cal, result); // use this in junit4
		assertThat(calculator).isEqualTo(result);
	}
	
	@Test
	void testSubtraction() {
		Calculator calculator = new Calculator();
		calculator.setAnswer(-3.0);
		calculator.setDetail("12 - 15 = -3.0");
		Calculator result = controller.subtraction(number1, number2);
		assertThat(calculator).isEqualTo(result);
	}
	
	@Test
	void testMultiplication() {
		Calculator calculator = new Calculator();
		calculator.setAnswer(180.0);
		calculator.setDetail("12 * 15 = 180.0");
		Calculator result = controller.multiplication(number1, number2);
		assertThat(calculator).isEqualTo(result);
	}
	
	@Test
	void testDivision() {
		Calculator calculator = new Calculator();
		calculator.setAnswer(0.8);
		calculator.setDetail("12 / 15 = 0.8");
		Calculator result = controller.division(number1, number2);
		assertThat(calculator).isEqualTo(result);
	}
	
	@Test
	void testSquare() {
		Calculator calculator = new Calculator();
		calculator.setAnswer(25.0);
		calculator.setDetail("Square of 5 = 25.0");
		Calculator result = controller.square(5);
		assertThat(calculator).isEqualTo(result);
	}
	
	@Test
	void testSquareroot() {
		Calculator calculator = new Calculator();
		calculator.setAnswer(15.0);
		calculator.setDetail("Squareroot of 225 = 15.0");
		Calculator result = controller.squareroot(225);
		assertThat(calculator).isEqualTo(result);
	}
	
	@Test
	void testFactorial() {
		Calculator calculator = new Calculator();
		calculator.setAnswer(120.0);
		calculator.setDetail("5! = 120.0");
		Calculator result = controller.factorial(5);
		assertThat(calculator).isEqualTo(result);
	}
	
	@Test
	void testMinmax() {
		Map<String, Object> list = new HashMap<String, Object>(); 
		List<Integer> arr = new ArrayList<Integer>(4);
		arr.add(-15); arr.add(19); arr.add(10); arr.add(-5);
		list.put("numbers", arr);
		String output = "min : -15, max : 19";
		String result = controller.calculateMinMax(list);
		assertThat(output).isEqualTo(result);
	}
}
