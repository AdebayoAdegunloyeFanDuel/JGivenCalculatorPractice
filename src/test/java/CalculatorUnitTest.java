import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorUnitTest {
	private static Calculator calculator;

	@BeforeAll
	private static void setup(){
		calculator = new Calculator();
	}

	@Test
	public void additionTest(){
		assertEquals( 4, calculator.addition( 2,2 ) );
	}

	@Test
	public void subtractionTest(){
		assertEquals( 0, calculator.subtraction( 2,2 ) );
	}

	@Test
	public void multiplicationTest(){
		assertEquals( 9, calculator.multiplication( 3,3 ) );
	}

	@Test
	public void divisionTest(){
		assertEquals( 2, calculator.division( 4,2 ) );
	}

}
