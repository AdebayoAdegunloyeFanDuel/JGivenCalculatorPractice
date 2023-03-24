import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

public class ThenValueIsReturned extends Stage<ThenValueIsReturned> {

	@ExpectedScenarioState
	int calculatorResult;

	public ThenValueIsReturned calculatorResultIs( int expectedAnswer) {
		assertEquals(expectedAnswer, calculatorResult);
		return this;

	}
}
