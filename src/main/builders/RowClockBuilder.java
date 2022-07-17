package main.builders;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static main.enums.LightColorEnum.RED;

@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class RowClockBuilder {

    public static String buildRowClock(String inputTime, int[] timeIndexes, int totalLamps, boolean singleTimeUnits, char lightColor, char startingColor){
        String startingColors = getStartingColors (totalLamps, startingColor);
        int timeSelection = getTimeSelection (inputTime, timeIndexes);
        int indexLightsOn = getIndexLightsOn( singleTimeUnits,totalLamps, timeSelection);
        return makeLights(totalLamps, startingColors, indexLightsOn, startingColor,  lightColor, timeSelection);
    }

    private static String getStartingColors(int totalLamps, char startingColor){
        StringBuilder startingColors = new StringBuilder();
        for (int i = 1; i <= totalLamps; i++) {
            startingColors.append(startingColor);
        }
        return  startingColors.toString();
    }

    private static int getIndexLightsOn(boolean single, int totalLamps, int timeSelection){
        int index;
        if (single) index = timeSelection % ++totalLamps;
        else  index = timeSelection / ++totalLamps;
        return index;
    }

    private static int getTimeSelection(String time, int[] timeIndexes) {
        String selectTime = time.substring(timeIndexes[0], timeIndexes[1]);
        return Integer.parseInt(selectTime);
    }

    private static String makeLights(int totalLamps, String startingColors, int indexLightsOn, char startingColor, char lightColor, int timeSelection){
        /**  de else conditie is voor de fiveMinutesRow */
        if (totalLamps < 5){
            String switchOn = startingColors.substring(0,indexLightsOn).replace(startingColor, lightColor);
            String switchOff =startingColors.substring(indexLightsOn,totalLamps);
            return  switchOn + switchOff;
        } else {
            indexLightsOn = timeSelection / 5;
            String switchOn = startingColors.substring(0,indexLightsOn).replace(startingColor, lightColor);
            StringBuilder switchOnStr = new StringBuilder(switchOn);
            for (int i = 2; i < switchOn.length(); i=i+3) {
                switchOnStr.setCharAt(i, RED.getColorLights());
            }
            String switchOff =startingColors.substring(indexLightsOn,totalLamps);
            return  switchOnStr + switchOff;
        }
    }
}
