package main.java;

import java.util.HashMap;
import java.util.Map;

public enum Day { 

    MONDAY("M", "FirstDay"), TUESDAY("T", "SecondDay"), WEDNESDAY("W", "ThirdDay"),
    THURSDAY("R", "FourthDay"), FRIDAY("F", "FifthDay"), SATURDAY("Sa", "SixDay"), SUNDAY("Su", "SevenDay"), ;

    private final String abbreviation;
    private final String description;


	// Reverse-lookup map for getting a day from an abbreviation
    private static final Map<String, String> lookup = new HashMap<String, String>();

    static {
        for (Day d : Day.values()) {
            lookup.put(d.getAbbreviation(), d.description);
        }
    }

    private Day(String abbreviation, String description) {
        this.abbreviation = abbreviation;
        this.description = description;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
    
    public String getDescription() {
		return description;
	}

    public static String get(String abbreviation) {
        return lookup.get(abbreviation);
    }
}