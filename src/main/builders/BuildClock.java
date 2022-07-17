package main.builders;

import static main.enums.LightColorEnum.*;
import static main.enums.TimeEnum.*;

public class BuildClock extends RowClockBuilder{

    public static String entireClock(String inputTime) {
        String secondsLamp = secondsLamp(inputTime);
        String fiveHoursRow = fiveHoursRow(inputTime);
        String singleHoursRow = singleHoursRow(inputTime);
        String fiveMinutesRow = fiveMinutesRowCalc(inputTime);
        String singleMinutesRow = singleMinutesRow(inputTime);
        return secondsLamp + fiveHoursRow + singleHoursRow + fiveMinutesRow + singleMinutesRow;
    }

    public static String secondsLamp(String inputTime){
        return buildRowClock(inputTime, SECONDS.getTimeSelection(), 1, true, LIGHTS_OFF.getColorLights(), YELLOW.getColorLights());
    }

    public static String fiveHoursRow(String inputTime) {
        return buildRowClock(inputTime, HOURS.getTimeSelection(), 4, false, RED.getColorLights(), LIGHTS_OFF.getColorLights());
    }

    public static String singleHoursRow(String inputTime){
        return buildRowClock(inputTime, HOURS.getTimeSelection(), 4, true, RED.getColorLights(), LIGHTS_OFF.getColorLights());
    }

    public static String fiveMinutesRowCalc(String inputTime){
        return buildRowClock(inputTime, MINUTES.getTimeSelection(), 11, false, YELLOW.getColorLights(), LIGHTS_OFF.getColorLights());
    }

    public static String singleMinutesRow(String inputTime){
        return buildRowClock(inputTime, MINUTES.getTimeSelection(), 4, true, YELLOW.getColorLights(), LIGHTS_OFF.getColorLights());
    }
}
