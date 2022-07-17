package main;

import main.builders.*;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Scanner;

public class BerlinClockConverter extends BuildClock {

    public static void runClockConverter(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter time: ");
        String inputTime = input.nextLine();

        try {
            LocalTime.parse(inputTime);
            String secondsLamp = secondsLamp(inputTime);
            String fiveHoursRow = fiveHoursRow(inputTime);
            String singleHoursRow = singleHoursRow(inputTime);
            String fiveMinutesRow = fiveMinutesRowCalc(inputTime);
            String singleMinutesRow = singleMinutesRow(inputTime);
            String berlinClockComplete = entireClock(inputTime);

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
            System.out.println("Something went wrong, please try again.");
            System.out.println(e.getMessage());
            input.reset();
            runClockConverter();
        }
        input.close();
    }
}
