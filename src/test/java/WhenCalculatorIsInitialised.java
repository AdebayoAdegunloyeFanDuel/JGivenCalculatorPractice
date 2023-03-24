import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

public class WhenCalculatorIsInitialised extends Stage<WhenCalculatorIsInitialised> {

	@ExpectedScenarioState
	Calculator calculator;

	@ProvidedScenarioState
	int calculatorResult;

	public WhenCalculatorIsInitialised userEntersNumbersToAdd(int a, int b) {
		calculatorResult = calculator.addition( a,b );
		return this;
	}

	public WhenCalculatorIsInitialised userEntersNumbersToSubtract(int a, int b) {
		calculatorResult = calculator.subtraction( a,b );
		return this;
	}


}
