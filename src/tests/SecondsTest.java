package tests;

import main.builders.BuildClock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SecondsTest extends BuildClock {

    @ParameterizedTest(name = "{index} => actual={0}, expected={1}")
    @CsvSource({
            "00:00:00, Y",
            "23:59:59, O"
    })

    void secondsLampRequirements(String actual, String expected) {
        Assertions.assertEquals(expected, secondsLamp(actual));
    }
}
