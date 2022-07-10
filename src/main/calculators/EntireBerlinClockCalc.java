package main.calculators;

public class EntireBerlinClockCalc {

    public String entireBerlinClock(String inputTime) {

        SingleMinutesCalc singleMinutesCalc = new SingleMinutesCalc();
        FiveMinutesCalc fiveMinutesCalc = new FiveMinutesCalc();
        SingleHoursCalc singleHoursCalc = new SingleHoursCalc();
        FiveHoursCalc fiveHoursCalc = new FiveHoursCalc();
        SecondsCalc secondsCalc = new SecondsCalc();

        String secondsLamp = secondsCalc.secondsLamp(inputTime);
        String fiveHoursRow = fiveHoursCalc.fiveHoursRow(inputTime);
        String singleHoursRow = singleHoursCalc.singleHoursRow(inputTime);
        String fiveMinutesRow = fiveMinutesCalc.fiveMinutesRow(inputTime);
        String singleMinutesRow = singleMinutesCalc.singleMinutesRow(inputTime);

        return secondsLamp + fiveHoursRow + singleHoursRow + fiveMinutesRow + singleMinutesRow;
    }
}
