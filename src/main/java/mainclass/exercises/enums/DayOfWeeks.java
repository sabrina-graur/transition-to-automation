package mainclass.exercises.enums;

public class DayOfWeeks {
    public static void main(String[] args) {
        DayOfWeek friday = DayOfWeek.FRIDAY;
        DayOfWeek saturday = DayOfWeek.SATURDAY;
        printDayInformation(friday);
        printDayInformation(saturday);
        printDayInformation(DayOfWeek.MONDAY);
    }

    public static void printDayInformation(DayOfWeek day) {
        System.out.println("day: " + day);
        System.out.println("Is weekend? " + day.isWeekend());
    }
}
