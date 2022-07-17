package main.enums;

public enum LightColorEnum {

    RED ('R'),
    YELLOW ('Y'),
    LIGHTS_OFF ('O');

    private final char colorLights;

    LightColorEnum(char color) { this.colorLights = color; }

    public char getColorLights() { return colorLights; }
}
