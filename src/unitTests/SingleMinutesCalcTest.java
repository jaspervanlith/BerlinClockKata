package unitTests;

import main.calculators.SingleMinutesCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SingleMinutesCalcTest {
    SingleMinutesCalc singleMinutesCalc = new SingleMinutesCalc();

    @ParameterizedTest(name = "{index} => actual={0}, expected={1}")
    @CsvSource({
            "00:00:00, OOOO",
            "23:59:59, YYYY",
            "12:32:00, YYOO",
            "12:34:00, YYYY",
            "12:35:00, OOOO"
    })

    void singleMinutesRequirements(String actual, String expected) {
        Assertions.assertEquals(expected, singleMinutesCalc.singleMinutesRow(actual));
    }
}
