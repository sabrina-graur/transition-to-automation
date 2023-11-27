package mainclass.exercises;

public class DayOfWeeks {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.FRIDAY;
        System.out.println(day.isWeekend(DayOfWeek.FRIDAY));
        System.out.println(day.printDayInformation(DayOfWeek.SATURDAY));
    }
}

//2.	Add a method isWeekend() to the enum that returns true for Saturday and Sunday, and false for the rest of the days.
// 3.	Implement a method printDayInformation(DayOfWeek day) that takes a DayOfWeek as an argument and prints information
// about whether it's a weekend or a weekday.
//4.	Additionally, create a Main class to test the enum and its methods.