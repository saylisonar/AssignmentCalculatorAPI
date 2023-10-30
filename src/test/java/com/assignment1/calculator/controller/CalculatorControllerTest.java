/**
 * 
 */
package com.assignment1.calculator.controller;

import static org.assertj.core.api.Assertions.assertThat;
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
	
	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		calculator.setAnswer((Double)15.0);
		calculator.setDetail("10 + 5 = 15.0");
		Calculator result = controller.addition(10, 5);
		//assertEquals(cal, result); // use this in junit4
		assertThat(calculator).isEqualTo(result);
	}
}
