import org.junit.jupiter.api.Test;

import com.tngtech.jgiven.junit5.ScenarioTest;

public class CalculatorJGivenTest extends
	ScenarioTest<GivenUserWantToCalculate, WhenCalculatorIsInitialised, ThenValueIsReturned> {

	@Test
	public void testAdditionCalculation(){
		given().aUserIntialisedCalculator();
		when().userEntersNumbersToAdd( 1, 1 );
		then().calculatorResultIs( 2 );
	}

	@Test
	public void testSubtractionCalculation(){
		given().aUserIntialisedCalculator();
		when().userEntersNumbersToSubtract( 1, 1 );
		then().calculatorResultIs( 0 );
	}
}
