package com.TChandhar.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTests {
	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
}
				}	
