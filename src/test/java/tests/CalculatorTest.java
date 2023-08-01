package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int exp = 30;
		calculator cal = new calculator();
		int act = cal.add(10, 20);
		assertEquals(exp, act);
	}
}
