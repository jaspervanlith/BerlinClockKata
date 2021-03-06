package tests;

import main.builders.BuildClock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class EntireClockTest{

    @ParameterizedTest(name = "{index} => actual={0}, expected={1}")
    @CsvSource({
            "00:00:00, YOOOOOOOOOOOOOOOOOOOOOOO",
            "23:59:59, ORRRRRRROYYRYYRYYRYYYYYY",
            "16:50:06, YRRROROOOYYRYYRYYRYOOOOO",
            "11:37:01, ORROOROOOYYRYYRYOOOOYYOO"
    })

    void fiveHourRequirements(String actual, String expected) {
        Assertions.assertEquals(expected, BuildClock.entireClock(actual));
    }
}
