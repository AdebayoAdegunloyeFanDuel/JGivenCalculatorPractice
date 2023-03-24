import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

public class GivenUserWantToCalculate extends Stage<GivenUserWantToCalculate> {

	// all do the same thing but Provided and Expected just give a bit more context,
	//	@ScenarioState
	//	@ProvidedScenarioState
	//	@ExpectedScenarioState

	@ProvidedScenarioState
	Calculator calculator;

	public GivenUserWantToCalculate aUserIntialisedCalculator() {
		calculator = new Calculator();
		return this;
	}

}
