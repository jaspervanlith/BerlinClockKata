package tests;

import main.builders.BuildClock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SingleHoursTest extends BuildClock {

    @ParameterizedTest(name = "{index} => actual={0}, expected={1}")
    @CsvSource({
            "00:00:00, OOOO",
            "23:59:59, RRRO",
            "02:04:00, RROO",
            "08:23:00, RRRO",
            "14:35:00, RRRR"
    })

    void singleHoursRequirements(String actual, String expected) {
        Assertions.assertEquals(expected, singleHoursRow(actual));
    }
}
