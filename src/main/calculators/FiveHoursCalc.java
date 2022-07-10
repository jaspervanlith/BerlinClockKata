package main.calculators;

public class FiveHoursCalc {

    public String fiveHoursRow(String inputTime) {

        String minuten = inputTime.substring(0, 2);
        int minutenNumber = Integer.parseInt(minuten);
        int minuteCategory = minutenNumber / 5;
        switch (minuteCategory) {
            case 0:
                return "OOOO";
            case 1:
                return "ROOO";
            case 2:
                return "RROO";
            case 3:
                return "RRRO";
            case 4:
                return "RRRR";
            default:
                return "";
        }
    }
}
