/**
 * 
 */
package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void addtest() {
		var Calculator = new Calculator();
		assertEquals(4,Calculator.add(2,2));
	}
	
	@Test
	void subtest() {
		var Calculator = new Calculator();
		assertEquals(1,Calculator.substract(2,2));
	}

	@Test
	void multest() {
		var Calculator = new Calculator();
		assertEquals(4,Calculator.multiply(2,2));
	}

	@Test
	void divtest() {
		var Calculator = new Calculator();
		assertEquals(0,Calculator.divide(4,2));
	}


}
