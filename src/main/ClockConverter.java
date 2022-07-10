package main;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import main.calculators.*;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Scanner;

@NoArgsConstructor(access= AccessLevel.PRIVATE)
public class ClockConverter {

    public static void runClockConverter(){

        SingleMinutesCalc singleMinutesCalc = new SingleMinutesCalc();
        FiveMinutesCalc fiveMinutesCalc = new FiveMinutesCalc();
        SingleHoursCalc singleHoursCalc = new SingleHoursCalc();
        FiveHoursCalc fiveHoursCalc = new FiveHoursCalc();
        SecondsCalc secondsCalc = new SecondsCalc();
        EntireBerlinClockCalc entireBerlinClockCalc = new EntireBerlinClockCalc();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter time: ");
        String inputTime = input.nextLine();

        try {
            LocalTime.parse(inputTime);
            String secondsLamp = secondsCalc.secondsLamp(inputTime);
            String fiveHoursRow = fiveHoursCalc.fiveHoursRow(inputTime);
            String singleHoursRow = singleHoursCalc.singleHoursRow(inputTime);
            String fiveMinutesRow = fiveMinutesCalc.fiveMinutesRow(inputTime);
            String singleMinutesRow = singleMinutesCalc.singleMinutesRow(inputTime);

            String berlinClockComplete = entireBerlinClockCalc.entireBerlinClock(inputTime);

            System.out.println("showSecondsLamp = " + secondsLamp);
            System.out.println("showFiveHoursRow = " + fiveHoursRow);
            System.out.println("showSingleHoursRow = " + singleHoursRow);
            System.out.println("showFiveMinutesRow = " + fiveMinutesRow);
            System.out.println("showSingleMinutesRow = " + singleMinutesRow);
            System.out.println("total clock = " + berlinClockComplete);

        } catch (DateTimeException e) {
            System.out.println("The values you entered were incorrect, please try again, and use the following format: \"hh:mm:ss\"");
            System.out.println(e.getMessage());
            input.reset();
            runClockConverter();
        } catch (Exception e) {
            System.out.println("Something whent wrong, please try again.");
            System.out.println(e.getMessage());
            input.reset();
            runClockConverter();
        }
        input.close();
    }
}
