package main.calculators;

public class SecondsCalc {

    public String secondsLamp(String inputTime){
        String minuten = inputTime.substring(6,8);
        int minutenNumber = Integer.parseInt(minuten);
        int minuteCategory = minutenNumber%2;
        switch (minuteCategory){
            case 0:
                return "Y";
            case 1:
                return "O";
            default:
                return "";
        }
    }
}
