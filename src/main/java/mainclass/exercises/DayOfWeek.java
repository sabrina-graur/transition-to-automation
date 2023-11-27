package mainclass.exercises;

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekend(DayOfWeek day) {
        return day.equals(SATURDAY) || day.equals(SUNDAY);
    }

    String printDayInformation(DayOfWeek day) {
        if (day.equals(SATURDAY) || day.equals(SUNDAY)) {
            return "It is a weekend";
        }
        return "It is a weekday";
    }
}


//    Create a Java program to represent the days of the week using an enum named DayOfWeek. Implement the following:
//1.	Define an enum DayOfWeek with constants for each day of the week (e.g., MONDAY, TUESDAY, ...).
//2.	Add a method isWeekend() to the enum that returns true for Saturday and Sunday, and false for the rest of the days.
// 3.	Implement a method printDayInformation(DayOfWeek day) that takes a DayOfWeek as an argument and prints information
// about whether it's a weekend or a weekday.
//4.	Additionally, create a Main class to test the enum and its methods.
