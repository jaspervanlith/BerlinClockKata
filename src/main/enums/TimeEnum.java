package main.enums;

public enum TimeEnum {

    HOURS (new int[] {0, 2}),
    MINUTES (new int[] {3, 5}),
    SECONDS (new int[] {6, 8});

    private final int [] timeSelectionArray;

    TimeEnum(int [] timeSelectionArray) {
        this.timeSelectionArray = timeSelectionArray;
    }
    
    public int [] getTimeSelection(){return timeSelectionArray;}
}
