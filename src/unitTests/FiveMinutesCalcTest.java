package unitTests;

import main.calculators.FiveMinutesCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FiveMinutesCalcTest {

    FiveMinutesCalc fiveMinutesCalc = new FiveMinutesCalc();

    @ParameterizedTest(name = "{index} => actual={0}, expected={1}")
    @CsvSource({
            "00:00:00, OOOOOOOOOOO",
            "23:59:59, YYRYYRYYRYY",
            "12:04:00, OOOOOOOOOOO",
            "12:23:00, YYRYOOOOOOO",
            "12:35:00, YYRYYRYOOOO"
    })

    void fiveMinutesRequirements(String actual, String expected) {
        Assertions.assertEquals(expected, fiveMinutesCalc.fiveMinutesRow(actual));
    }
}
