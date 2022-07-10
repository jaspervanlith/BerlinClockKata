package main.calculators;

public class SingleMinutesCalc {

    public String singleMinutesRow(String inputTime){
        String minuten = inputTime.substring(4,5);
        int minutenNumber = Integer.parseInt(minuten);
        int minuteCategory = minutenNumber%5;

        switch (minuteCategory){
            case 0:
                return "OOOO";
            case 1:
                return "YOOO";
            case 2:
                return "YYOO";
            case 3:
                return "YYYO";
            case 4:
                return "YYYY";
            default:
                return "";
        }
    }

}
