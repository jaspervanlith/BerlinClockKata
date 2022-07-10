package main.calculators;

public class FiveMinutesCalc {

    public String fiveMinutesRow(String inputTime){
        String minuten = inputTime.substring(3,5);
        int minutenNumber = Integer.parseInt(minuten);
        int minuteCategory = minutenNumber/5;
        switch (minuteCategory){
            case 0:
                return "OOOOOOOOOOO";
            case 1:
                return "YOOOOOOOOOO";
            case 2:
                return "YYOOOOOOOOO";
            case 3:
                return "YYROOOOOOOO";
            case 4:
                return "YYRYOOOOOOO";
            case 5:
                return "YYRYYOOOOOO";
            case 6:
                return "YYRYYROOOOO";
            case 7:
                return "YYRYYRYOOOO";
            case 8:
                return "YYRYYRYYOOO";
            case 9:
                return "YYRYYRYYROO";
            case 10:
                return "YYRYYRYYRYO";
            case 11:
                return "YYRYYRYYRYY";
            default:
                return "";
        }
    }
}
